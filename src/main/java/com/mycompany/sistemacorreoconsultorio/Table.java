/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacorreoconsultorio;

/**
 *
 * @author Christian
 */
import java.util.List;

public class Table {
    private String nombre;
    private List<String> atributos;

    public Table(String nombre, List<String> atributos) {
        this.nombre = nombre;
        this.atributos = atributos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getAtributos() {
        return atributos;
    }

    @Override
    public String toString() {
        return "Tabla{" +
                "nombre='" + nombre + '\'' +
                ", atributos=" + atributos +
                '}';
    }

}

