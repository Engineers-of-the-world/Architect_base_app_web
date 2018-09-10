/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controller;

import com.jhopes.controllerimpl.CategoriaCtrlImpl;
import java.io.Serializable;
import com.jhopes.dao.CategoriaDAO;
import com.jhopes.modell.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author P&D
 */
@ManagedBean(name = "categoriaCtrl")
@ViewScoped
public class CategoriaCtrl implements Serializable {
    private static final long serialVersionUID = 1L;
    private Categoria selected;
    private boolean est;
    private CategoriaDAO catdao;
    private List<Categoria> list = new ArrayList<Categoria>();
    

    public CategoriaCtrl() {
        this.selected = new Categoria();
        this.catdao = new CategoriaCtrlImpl();
    }

    public void createCategoria() {        
        if (catdao.createCategoria(selected)) {
            System.out.println("Insertado");
        } else {
            System.out.println("Error al momento de insertar");
        }
    }

    public List<Categoria> getList() {
        list = catdao.readCategoria();
        return list;
    }
    public void prepareUpdate(Categoria cat){
    //this.selected = new Categoria();
        System.out.println("hola cattttt ");
    this.selected = cat;
    }
    public void updateCategoria() {
        System.out.println("Id categoria = "+selected.getId_categoria());
        System.out.println("valor de edit "+selected.getName_cat());
        if (catdao.updateCategoria(selected)) {
            System.out.println("Actualizado");
        } else {
            System.out.println("Error al momento de actualizar");
        }
        
    }
    public void deleteCategoria(String id){
        
        if (catdao.deleteCategoria(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Categoria getSelected() {
        return selected;
    }

    public void setSelected(Categoria selected) {
        this.selected = selected;
    }    	
}
