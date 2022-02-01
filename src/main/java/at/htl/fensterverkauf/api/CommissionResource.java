package at.htl.fensterverkauf.api;

import at.htl.fensterverkauf.Service.CommissionService;
import at.htl.fensterverkauf.model.CommissionDTO;
import at.htl.fensterverkauf.workloads.Commission;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/commission")
public class CommissionResource {

    private CommissionService commissionService = new CommissionService();

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance commission(Commission commission);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getAll() {
        return Templates.commission(commissionService.getAll());
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@PathParam("id") Integer id) {
        return Templates.commission(commissionService.findCommission(id));
    }

    /*
    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getById(@PathParam("id") Integer id){
        return commission.data("commission", commissionDTO.findById(Long.valueOf(id)));
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCommission(Commission commission){
        CommissionDTO.persist(commission);
        if (CommissionDTO.isPersistent(commission)){
            return Response.created(URI.create("/commission"+commission.getCommissionId())).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
    */
}
