package at.htl.fensterverkauf.api;

import at.htl.fensterverkauf.Service.CommissionServiceImpl;
import at.htl.fensterverkauf.workloads.Commission;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/commission")
public class CommissionResource {

    private CommissionServiceImpl commissionService = new CommissionServiceImpl();

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
