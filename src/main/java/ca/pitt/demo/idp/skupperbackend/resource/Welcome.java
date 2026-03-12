package ca.pitt.demo.idp.skupperbackend.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/server")
public class Welcome {

    @ConfigProperty(name = "current.server")
    String server;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getServer() {
        return this.server;
    }
}