package at.htl.fensterverkauf.api;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;
import at.htl.fensterverkauf.workloads.Order.Commission.CommissionRepo;
import at.htl.fensterverkauf.workloads.Order.Lkw.Lkw;
import at.htl.fensterverkauf.workloads.Order.Lkw.LkwRepo;
import at.htl.fensterverkauf.workloads.Order.Location.Location;
import at.htl.fensterverkauf.workloads.Order.Location.LocationRepo;
import at.htl.fensterverkauf.workloads.Order.Shipment.Shipment;
import at.htl.fensterverkauf.workloads.Order.Shipment.ShipmentRepo;
import at.htl.fensterverkauf.workloads.Person.Customer.Customer;
import at.htl.fensterverkauf.workloads.Person.Customer.CustomerRepo;
import at.htl.fensterverkauf.workloads.Person.Driver.Driver;
import at.htl.fensterverkauf.workloads.Person.Driver.DriverRepo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.time.LocalDate;
import java.util.List;

@Path("commission")
public class CommissionResource {

    private final CommissionRepo cRepo;
    private final CustomerRepo cusRepo;
    private final ShipmentRepo sRepo;
    private final LocationRepo lRepo;
    private final DriverRepo dRepo;
    private final LkwRepo lkwRepo;

    public CommissionResource(CommissionRepo cRepo, CustomerRepo cusRepo, ShipmentRepo sRepo, LocationRepo lRepo, DriverRepo dRepo, LkwRepo lkwRepo) {
        this.cRepo = cRepo;
        this.cusRepo = cusRepo;
        this.sRepo = sRepo;
        this.lRepo = lRepo;
        this.dRepo = dRepo;
        this.lkwRepo = lkwRepo;
    }


    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance commissions(List<Commission> commissions);
        public static native TemplateInstance error(String msg);

    }

    @GET
    @Path("all")
    @Produces(MediaType.TEXT_HTML)
@Transactional
    public Response getAll() {
        Commission commission = new Commission();
        Customer customer = new Customer("Lukas","Baum");
        cusRepo.add(customer);
        Location location = new Location("Teststreet",customer);
        lRepo.add(location);
        commission.setLocation(location);
        Driver driver =new Driver("Lukas","Lkw", 1.0,0,true,true);
        dRepo.add(driver);
        Lkw lkw = new Lkw("Opel","Blitz");
        lkwRepo.add(lkw);
        Shipment shipment = new Shipment(driver,lkw,LocalDate.now());
        sRepo.add(shipment);
        commission.setShipment(shipment);
        cRepo.add(commission);

        return Response.ok(Templates.commissions(cRepo.getAll())).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Transactional
    @Path("add")
    public Response add(
            @Context UriInfo uriInfo
            , @FormParam("shipment") int shipmentId
            , @FormParam("location") int locationId
    ) {
        Shipment shipment = this.sRepo.findShipmentById(shipmentId);
        Location location = this.lRepo.findById(locationId);

        if (shipment == null) {
            String message = "Shipment not found";
            return Response
                    .status(404)
                    .entity(this.showError(message))
                    .type(MediaType.TEXT_HTML_TYPE)
                    .build();
        }

        if (location == null) {
            String message = "Location not found";
            return Response
                    .status(404)
                    .entity(this.showError(message))
                    .type(MediaType.TEXT_HTML_TYPE)
                    .build();
        }
        Commission commission = new Commission(shipment, location);
        cRepo.add(commission);
        return Response.status(301)
                .location(URI.create("/all"))
                .build();
    }

    @GET
    @Path("error")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance showError(String message) {
        return Templates.error(message);
    }
}

