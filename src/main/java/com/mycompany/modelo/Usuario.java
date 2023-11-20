/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import com.mycompany.sistemacorreoconsultorio.DB;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Christian
 */
public class Usuario {

    private int id;
    private String ci;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String residenciaActual;
    private Integer celular;
    private String genero;
    private String tipo;
    private String email;
    private String password;

    java.sql.Statement st;
    ResultSet rs;
    DB db = new DB();

    // Constructor
    public Usuario(int id, String ci, String nombre, String apellido, Date fechaNacimiento,
            String residenciaActual, Integer celular, String genero, String tipo,
            String email, String password) {
        this.id = id;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.residenciaActual = residenciaActual;
        this.celular = celular;
        this.genero = genero;
        this.tipo = tipo;
        this.email = email;
        this.password = password;
    }

    // Getters y setters (puedes generarlos automáticamente en muchos IDEs)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public HashMap<Integer, String[]> all() {

        HashMap<Integer, String[]> registros = new HashMap<>();
        try {
            Connection connection = db.establecerConexion();
            st = connection.createStatement();
            String sql = "SELECT * FROM user;";
            rs = st.executeQuery(sql);
            // Obtener información sobre las columnas
            ResultSetMetaData metadata = rs.getMetaData();
            int numColumnas = metadata.getColumnCount();

            // Agregar los nombres de las columnas a la cadena de salida
            String reg[] = new String[numColumnas];
            for (int i = 1; i <= numColumnas; i++) {
                // System.out.print("|"+metadata.getColumnName(i));
                reg[i - 1] = metadata.getColumnName(i);
            }
            registros.put(0, reg);
            //    mostrarHashMap(registros);
            System.out.println("***************************************");
            // Recorrer los resultados y agregar cada fila a la cadena de salida
            int i = 1;
            while (rs.next()) {
                String registro[] = new String[numColumnas];
                //System.out.print(rs.getString("per_cod")+", "+rs.getString("per_nom")+", "+rs.getString("per_appm")+", "+rs.getString("per_prof"));
                registro[0] = rs.getString("per_cod").trim();
                registro[1] = rs.getString("per_nom").trim();
                registro[2] = rs.getString("per_appm").trim();
                registro[3] = rs.getString("per_prof").trim();
                registro[4] = rs.getString("per_telf").trim();
                registro[5] = rs.getString("per_cel").trim();
                registro[6] = rs.getString("per_email").trim();
                registro[7] = rs.getString("per_dir").trim();
                registro[8] = rs.getString("per_fnac").trim();
                registro[9] = rs.getString("per_flug").trim();
                registro[10] = rs.getString("per_type").trim();
                registro[11] = rs.getString("per_pass").trim();
                registro[12] = rs.getString("per_create").trim();
                registro[13] = rs.getString("per_update").trim();

                registros.put(i, registro);
                i++;
            }

            rs.close();
            connection.close();
            // System.out.println("EL REGISTRO SE REALIZO EXITOSAMENTE");
        } catch (Exception e) {
            System.out.println("Error al conectar a la Base de datos: " + e.toString());
        }

        return registros;
    }
    // Otros getters y setters para el resto de los campos
}
