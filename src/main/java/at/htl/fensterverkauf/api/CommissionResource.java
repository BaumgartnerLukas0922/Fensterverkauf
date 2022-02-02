package at.htl.fensterverkauf.api;

import at.htl.fensterverkauf.Repository.CommissionRepo;
import at.htl.fensterverkauf.workloads.Commission;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/commission")
public class CommissionResource {

    private final CommissionRepo commissionRepo;

    public CommissionResource(CommissionRepo commissionRepo) {
        this.commissionRepo = commissionRepo;
    }

    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance commission(Commission commission);
    }

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        var comm = commissionRepo.getAll();
        return Response.ok(comm).build();
    }

    /*
    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@PathParam("id") Integer id) {
        return Templates.commission(commissionRepo.findCommission(id));
    }

    @POST
    @Path("add")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance addCommission(Commission commission) {
        return Templates.commission(commissionRepo.addCommission(commission));
    }


    /*
    @Transactional
    @POST
    public Response addCommission(CommissionDTO commissionDTO){
        var result = commissionRepo.addCommission(commissionDTO);
        return (result ? Response.ok() :
                Response.status(Response.Status.BAD_REQUEST)).build();
    }


     */
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
