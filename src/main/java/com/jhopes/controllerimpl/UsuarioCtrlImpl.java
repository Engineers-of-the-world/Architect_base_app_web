/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controllerimpl;

import com.jhopes.configbd.Conexionbd;
import com.jhopes.dao.UsuarioDAO;
import com.jhopes.modell.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P&D
 */
public class UsuarioCtrlImpl implements UsuarioDAO{
    Conexionbd cx;
    String sql;
    ResultSet rs;
    List<Usuario> listDatos;
    public UsuarioCtrlImpl() {
        cx = new Conexionbd();
    }

    @Override
    public int createUsuario(Usuario us) {
        sql = "INSERT INTO public.usuario(id_persona, campo1 , campo2, estado) "
                + "VALUES("+us.getId_persona()+", '"+us.getCampo1()+"', '"+us.getCampo2()+"', '"+us.getEstado()+"')";
        int id = cx.performKeys(sql);
        return id;
    }

    @Override
    public List<Usuario> readUsuario() {
        listDatos = new ArrayList<>();
        sql = "SELECT id_usuario, id_persona, campo1 , campo2, estado "
                + "    FROM public.usuario";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Usuario(rs.getString("id_usuario"),rs.getString("id_persona"),rs.getString("campo1"),rs.getString("campo2"), rs.getString("estado")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

    @Override
    public boolean updateUsuario(Usuario us) {
       sql = "UPDATE public.usuario SET "
                + " name_cat = '"+us.getCampo1()+"', estado = '"+us.getEstado()+"' "
                + "WHERE id_usuario = "+us.getId_usuario()+" ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deleteUsuario(String id) {
        sql = "DELETE FROM public.usuario "
                + "WHERE id_usuario = "+id+" ";
        return cx.executeInsertUpdate(sql);
    }
    
}
