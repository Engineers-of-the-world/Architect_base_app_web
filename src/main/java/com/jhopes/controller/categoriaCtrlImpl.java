/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controller;

import com.jhopes.bean.categoria;
import com.jhopes.configbd.Conexionbd;
import com.jhopes.dao.categoriaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P&D
 */
public class categoriaCtrlImpl implements categoriaDAO {

    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<categoria> listDatos;

    public categoriaCtrlImpl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<categoria> readCategoria() {

        sql = "SELECT id_categoria, name_cat , estado "
                + "    FROM public.categoria";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                    ///FALTA
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(categoriaCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean updateCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
