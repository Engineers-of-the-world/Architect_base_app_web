/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controller;

import com.jhopes.controllerimpl.CategoriaCtrlImpl;
import com.jhopes.modell.Categoria;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.jhopes.dao.CategoriaDAO;

/**
 *
 * @author P&D
 */
@ManagedBean
@SessionScoped
public class CategoriaCtrl implements Serializable{

    private Categoria selected;
    private boolean est;
    CategoriaDAO catdao;

    public void createCategoria() {
        catdao = new CategoriaCtrlImpl();
        System.out.println("name categoria: " + selected.name_cat);
        //est = catdao.createCategoria(selected);
    }

    /**
     *
     * @return
     */
    public Categoria prepareCreate() {
        //selected = new Categoria();
        initializeEmbeddableKey();
        return selected;
    }
    public Categoria getCategoria() {
        return selected;
    }

    public void setCategoria(Categoria categoria) {
        this.selected = categoria;
    }

    private void initializeEmbeddableKey() {        
    }

}
