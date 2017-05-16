package de.uniba.jaxrs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import de.uniba.jaxrs.delete.Delete;
import de.uniba.jaxrs.get.Search;
import de.uniba.jaxrs.get.ReadAll;
import de.uniba.jaxrs.get.ReadSingle;
import de.uniba.jaxrs.post.Create;
import de.uniba.jaxrs.put.Update;

@ApplicationPath("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExamplesApi extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(ReadAll.class);
        resources.add(Search.class);
        resources.add(ReadSingle.class);
        resources.add(Delete.class);
        resources.add(Create.class);
        resources.add(Update.class);

        return resources;
    }
}
