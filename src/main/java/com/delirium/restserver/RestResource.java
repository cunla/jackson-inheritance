package com.delirium.restserver;

/**
 * Created by morand3 on 7/24/2016.
 */

import com.delirium.restserver.model.Shape;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("")
public class RestResource {
    private Map<Long,Shape> db = Database.instance().getDb();


    @POST
    @Path("consume-json")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Shape consumeJson(Shape person) {
        person.setId(Long.valueOf(person.hashCode()));
        db.put(person.getId(), person);
        return person;
    }

    @GET
    @Path("produce-json/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Shape produceJson(@PathParam("id") Long id) {
        return db.get(id);
    }

}