package at.htl.fensterverkauf.api;

import at.htl.fensterverkauf.model.EmployeeDTO;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Map;

@Produces("application/json")
@Consumes("application/json")
@Path("employee")
public class EmployeeRessource {
    //private final EmployeeService employeeService;

    /*
    public EmployeeRessource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }*/

    @POST
    @Transactional
    public Response addEmployee(EmployeeDTO newHobby){
        return null;
    }

    @GET
    @Path("all/stats")
    public Response getEmployeeCount(){
        return null;
    }

}
