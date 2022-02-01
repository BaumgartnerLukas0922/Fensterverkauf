package at.htl.fensterverkauf.api;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/comission")
public class ComissionResource {


    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance fensterverkauf(String name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Herzlich willkommen zu unserem Fensterverkauf!";
    }

}
