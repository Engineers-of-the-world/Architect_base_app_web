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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author P&D
 */
@ManagedBean(name = "categoriaCtrl")
@SessionScoped
public class CategoriaCtrl implements Serializable {

    private Categoria selected;
    private boolean est;
    CategoriaDAO catdao;
    private ArrayList<Categoria> list = new ArrayList<>();

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

    public ArrayList<Categoria> getList() {
        list = catdao.readCategoria();
        return list;
    }

    public void updateCategoria(Categoria cat) {
        System.out.println("categoria = "+cat.name_cat);
        if (catdao.updateCategoria(cat)) {
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
