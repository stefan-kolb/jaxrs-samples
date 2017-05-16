package de.uniba.jaxrs.get;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import de.uniba.jaxrs.models.Cat;
import de.uniba.jaxrs.stubs.CatsService;

@Path("cats")
public class ReadAll {

    @GET
    public List<Cat> getCats() {
        return CatsService.getFamousCats();
    }
}
