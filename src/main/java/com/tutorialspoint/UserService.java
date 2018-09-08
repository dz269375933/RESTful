package com.tutorialspoint;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {
    UserDao userDao = new UserDao();
    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public String getUsers(){
        JSONArray json=new JSONArray();
        json.add(userDao.getAllUsers());
        return json.toString();
    }

}
