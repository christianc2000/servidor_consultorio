/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacorreoconsultorio;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Christian
 */
public class TableInfo {

    private static Table tablas[];

    public TableInfo() {
        List<String> usuarioAtr = Arrays.asList("id", "ci", "nombre", "apellido", "fecha_nacimiento", "residencia_actual", "celular", "genero", "tipo", "email", "password");
        List<String> servicioAtr = Arrays.asList("id", "nombre", "nombre", "detalle", "precio");
        List<String> citaAtr = Arrays.asList("id", "cliente_id", "fecha", "hora", "estado", "costo", "detalle", "personal_id");

        Table tablaUsuario = new Table("USUARIO", usuarioAtr);
        Table tablaServicio = new Table("SERVICIO", servicioAtr);
        Table tablaCita = new Table("CITA", citaAtr);
        this.tablas = new Table[]{tablaUsuario, tablaServicio, tablaCita};
    }

}
