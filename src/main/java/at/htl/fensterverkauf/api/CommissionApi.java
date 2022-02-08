package at.htl.fensterverkauf.api;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;
import at.htl.fensterverkauf.workloads.Order.Commission.CommissionRepo;
import at.htl.fensterverkauf.workloads.Order.Location.Location;
import at.htl.fensterverkauf.workloads.Order.Location.LocationRepo;
import at.htl.fensterverkauf.workloads.Order.Shipment.Shipment;
import at.htl.fensterverkauf.workloads.Order.Shipment.ShipmentRepo;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;

@Path("api/commission")
public class CommissionApi {

    private final CommissionResource commissionResource;
    private final CommissionRepo cRepo;
    private final ShipmentRepo sRepo;
    private final LocationRepo lRepo;

    public CommissionApi(CommissionResource commissionResource, CommissionRepo cRepo, ShipmentRepo sRepo, LocationRepo lRepo) {
        this.commissionResource = commissionResource;
        this.cRepo = cRepo;
        this.sRepo = sRepo;
        this.lRepo = lRepo;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        return Response.ok(cRepo.getAll()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Transactional
    @Path("create")
    public Response create(
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
                    .entity(commissionResource.showError(message))
                    .type(MediaType.TEXT_HTML_TYPE)
                    .build();
        }

        if (location == null) {
            String message = "Location not found";
            return Response
                    .status(404)
                    .entity(commissionResource.showError(message))
                    .type(MediaType.TEXT_HTML_TYPE)
                    .build();
        }
        Commission commission = new Commission(shipment, location);
        cRepo.add(commission);
        return Response.status(301)
                .location(URI.create("/commission"))
                .build();
    }
}
