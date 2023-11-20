/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacorreoconsultorio;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Christian
 */
public class DB {
 
    Connection conectar = null;
    String servidor = "localhost";// (PostgreSQL);
    String usuario = "grupo01sc";//
    String contraseña = "grup001grup001";
    String db = "db_consultorio_tecno";
    String cadena = "jdbc:postgresql://" + servidor + "/" + db;

    public Connection establecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            System.out.println("Se estableció la conexión a la base de datos correctamente");
        } catch (Exception e) {
            System.out.println("Error al conectar a la Base de datos: " + e.toString());
        }
        return conectar;
    }

    public void cerrarConexion() {
        try {
            this.conectar.close();
            System.out.println("[ Servidor de BD: desconectado ]");
        } catch (Exception e) {
            System.out.println("Error en cerrar la conexion a la base de datos" + e.toString());
        }
    }
}
