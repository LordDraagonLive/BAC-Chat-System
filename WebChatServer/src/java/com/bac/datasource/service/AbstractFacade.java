/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bac.datasource.service;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Buddhi Adhikari 16280809
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    
    /**
     * Abstract concrete class's constructor
     * @param entityClass takes and entity class of <T>
     */
    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    /**
     * Create method which creates a row using the user's data
     * and mapping it to the database table using the entity manager
     * @param entity <T> type entity
     */
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    /**
     * Edit method which edits an existing row using the user's data
     * and mapping it to the database table using the entity manager
     * @param entity <T> type entity
     */
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    /**
     * Remove method which removes a row using the user's data
     * and mapping it to the database table using the entity manager
     * to remove a row data
     * @param entity <T> type entity
     */
    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    /**
     * Find method uses the instance ID to find
     * a specific row from the table
     * @param id Instance ID
     * @return The selected row of the table
     */
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    /**
     * findAll method selects and returns all the table rows as
     * list
     * @return List of table rows 
     */
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    /**
     * 
     * @param range
     * @return 
     */
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }
    /**
     * count method counts all the number of elements in a table
     * returns the exact count
     * @return Count as an int
     */
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}
