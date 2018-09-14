/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.dao;

import com.jhopes.modell.Usuario;
import java.util.List;

/**
 *
 * @author P&D
 */
public interface UsuarioDAO {
    public int createUsuario(Usuario us);
    public List<Usuario> readUsuario();
    public boolean updateUsuario(Usuario us);
    public boolean deleteUsuario(String id);
}
