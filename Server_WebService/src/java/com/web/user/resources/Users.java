package com.web.user.resources;

// @author adr20
import com.web.user.logic.Service;
import com.web.user.logic.User;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotAcceptableException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class Users {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createParam(@QueryParam("id") String id, @QueryParam("nombre") String nombre) {
        try {
            Thread hilo = new Thread(new Create(id, nombre));
            hilo.start();
        } catch (Exception ex) {
            throw new NotAcceptableException();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> read() {
        return Service.instance().usersREAD();
    }

}
