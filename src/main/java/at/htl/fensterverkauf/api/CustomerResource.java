package at.htl.fensterverkauf.api;

import at.htl.fensterverkauf.workloads.Order.Customer.Customer;
import at.htl.fensterverkauf.workloads.Order.Customer.CustomerRepoImpl;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("customer")
public class CustomerResource {

    private final CustomerRepoImpl repo;

    public CustomerResource(CustomerRepoImpl impl){
        this.repo = impl;
    }



    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance customers(List<Customer> customerList);
    }

    @GET
    @Path("all")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getAll(){
        return Templates.customers(repo.getAll());
    }
}
