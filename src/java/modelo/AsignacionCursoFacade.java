/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jonathan Marin
 */
@Stateless
public class AsignacionCursoFacade extends AbstractFacade<AsignacionCurso> {

    @PersistenceContext(unitName = "tutorialPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsignacionCursoFacade() {
        super(AsignacionCurso.class);
    }
    
}
