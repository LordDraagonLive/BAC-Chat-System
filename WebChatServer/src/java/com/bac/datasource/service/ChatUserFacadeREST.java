/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bac.datasource.service;

import com.bac.datasource.ChatUser;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author BAC DARLING
 */
@Stateless
@Path("com.bac.datasource.chatuser")
public class ChatUserFacadeREST extends AbstractFacade<ChatUser> {

    @PersistenceContext(unitName = "WebChatServerPU")
    private EntityManager em;

    /**
     * REST Facade constructor of ChatUser
     */
    public ChatUserFacadeREST() {
        super(ChatUser.class);
    }

    /**
     * create method copy of the ChatUser table/class
     * @param entity ChatUser Instance
     */
    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ChatUser entity) {
        super.create(entity);
    }

    /**
     * edit method copy of the ChatUser table/class
     * Inherited from AbstractFacade
     * @param id Instance ID
     * @param entity Instance of ChatUser
     */
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") String id, ChatUser entity) {
        super.edit(entity);
    }

    /**
     * delete method copy of the ChatUser table/class
     * Inherited from AbstractFacade
     * @param id Instance ID
     */
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    /**
     * find method copy of the ChatUser table/class
     * Inherited from AbstractFacade
     * @param id Instance ID
     * @return Selected Instance of ChatUser
     */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public ChatUser find(@PathParam("id") String id) {
        return super.find(id);
    }

    /**
     * findAll method copy of the ChatUser table/class
     * Inherited from AbstractFacade
     * @return List of ChatUser Instances
     */
    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ChatUser> findAll() {
        return super.findAll();
    }

    /**
     * findRange method copy of the ChatUser table/class
     * Inherited from AbstractFacade
     * @param from start range
     * @param to end range
     * @return List of ChatUser Instances
     */
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ChatUser> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    /**
     * count method copy of the ChatUser table/class
     * Inherited from AbstractFacade
     * @return Count of Instances as an int
     */
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    /**
     * Inherited from AbstractFacade
     * @return  EntityManager
     */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
