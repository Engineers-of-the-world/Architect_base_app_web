/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.configbd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author P&D
 */
public class Conexionbd {
    public void Conexionbd() {
        try {
            // We register the PostgreSQL driver
            // Registramos el driver de PostgresSQL
            try { 
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            Connection connection = null;
            // Database connect
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/dbprueba",
                    "postgres", "123456");
 
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    } 
    public static void main(String[] args) {
        Conexionbd javaPostgreSQLBasic = new Conexionbd();
        javaPostgreSQLBasic.Conexionbd(); 
    }
    
}
