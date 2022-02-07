package at.htl.fensterverkauf.api;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;
import at.htl.fensterverkauf.workloads.Order.Commission.CommissionRepo;
import at.htl.fensterverkauf.workloads.Order.Location.Location;
import at.htl.fensterverkauf.workloads.Order.Location.LocationRepo;
import at.htl.fensterverkauf.workloads.Order.Shipment.Shipment;
import at.htl.fensterverkauf.workloads.Order.Shipment.ShipmentRepo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

@Path("commission")
public class CommissionResource {

    private final CommissionRepo cRepo;
    private final ShipmentRepo sRepo;
    private final LocationRepo lRepo;

    public CommissionResource(CommissionRepo crepo, ShipmentRepo sRepo, LocationRepo lRepo) {
        this.cRepo = crepo;
        this.sRepo = sRepo;
        this.lRepo = lRepo;
    }

    @CheckedTemplate
    public static class Templates{
        public static native TemplateInstance commissions(List<Commission> commissions);
        public static native TemplateInstance error(String msg);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("all")
    public Response getAll(){
        return Response
                .ok(cRepo.getAll())
                .build();
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

        if(shipment == null){
            String message = "Shipment not found";
            return Response
                    .status(404)
                    .entity(this.showError(message))
                    .type(MediaType.TEXT_HTML_TYPE)
                    .build();
        }

        if(location == null){
            String message = "Location not found";
            return Response
                    .status(404)
                    .entity(this.showError(message))
                    .type(MediaType.TEXT_HTML_TYPE)
                    .build();
        }
        Commission commission = new Commission(shipment,location);
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

