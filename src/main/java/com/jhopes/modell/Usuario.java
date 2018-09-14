/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.modell;

/**
 *
 * @author P&D
 */
public class Usuario {
   String id_usuario,id_persona, campo1 , campo2,estado ;

    public Usuario(String id_usuario, String id_persona, String campo1, String campo2, String estado) {
        this.id_usuario = id_usuario;
        this.id_persona = id_persona;
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.estado = estado;
    }

    public Usuario() {
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    
}
