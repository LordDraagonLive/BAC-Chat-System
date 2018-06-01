/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bac.datasource.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author BAC DARLING
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.bac.datasource.service.ChatMessageFacadeREST.class);
        resources.add(com.bac.datasource.service.ChatThreadFacadeREST.class);
        resources.add(com.bac.datasource.service.ChatUserFacadeREST.class);
    }
    
}
