package at.htl.fensterverkauf.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("verkauf")
public class FensterVerkaufResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Herzlich willkommen zu unserem Fensterverkauf!";
    }

}
