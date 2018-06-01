/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bac.datasource.service;

import com.bac.datasource.ChatMessage;
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
 * @author Buddhi Adhikari 16280809
 */
@Stateless
@Path("com.bac.datasource.chatmessage")
public class ChatMessageFacadeREST extends AbstractFacade<ChatMessage> {

    @PersistenceContext(unitName = "WebChatServerPU")
    private EntityManager em;

    /**
     * REST FACADE constructor for ChatMessage
     */
    public ChatMessageFacadeREST() {
        super(ChatMessage.class);
    }

    /**
     * create method copy of the ChatMessage table/class
     * @param entity ChatMessage Instance
     */
    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ChatMessage entity) {
        super.create(entity);
    }

    /**
     * edit method copy of the ChatMessage table/class
     * Inherited from AbstractFacade
     * @param id Instance ID
     * @param entity Instance of ChatMessage
     */
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, ChatMessage entity) {
        super.edit(entity);
    }

    /**
     * delete method copy of the ChatMessage table/class
     * Inherited from AbstractFacade
     * @param id Instance ID
     */
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    /**
     * find method copy of the ChatMessage table/class
     * Inherited from AbstractFacade
     * @param id Instance ID
     * @return Selected Instance of ChatMessage
     */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public ChatMessage find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    /**
     * findAll method copy of the ChatMessage table/class
     * Inherited from AbstractFacade
     * @return List of ChatMessage Instances
     */
    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ChatMessage> findAll() {
        return super.findAll();
    }

    /**
     * findRange method copy of the ChatMessage table/class
     * Inherited from AbstractFacade
     * @param from start range
     * @param to end range
     * @return List of ChatMessage Instances
     */
    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ChatMessage> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    /**
     * count method copy of the ChatMessage table/class
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
     * @return  EntityManagerr
     */
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
