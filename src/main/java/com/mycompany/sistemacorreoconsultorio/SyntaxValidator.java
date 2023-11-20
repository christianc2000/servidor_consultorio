/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacorreoconsultorio;

import com.mycompany.modelo.Usuario;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Christian
 */
public class SyntaxValidator {

    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce un comando:");
        String command = scanner.nextLine();

        System.out.println("atributos" + validateSyntax(command).getAttributes());

    }*/
    public static CommandInfo validateSyntax(String command) {
        Pattern pattern = Pattern.compile("^([A-Z]+)\\[\"([A-Za-z0-9_]+)\"\\]\\[(\".*?\"(,\".*?\")*)\\];$");
        Matcher matcher = pattern.matcher(command);

        if (matcher.find()) {
            String action = matcher.group(1);
            String table = matcher.group(2);
            String attributes = matcher.group(3);

            switch (action) {
                case "LIST":
                    // Realizar acción para LIST
                    System.out.println("Listando todos los elementos de la tabla " + table);
                    return new CommandInfo(action, table, null);

                case "INSE":
                    // Realizar acción para INSE
                    System.out.println("Insertando en la tabla " + table + " los atributos " + attributes);
                    return new CommandInfo(action, table, attributes.split(","));
                case "EDIT":
                    // Realizar acción para EDIT
                    System.out.println("Editando en la tabla " + table + " los atributos " + attributes);
                    break;
                case "MOST":
                    // Realizar acción para MOST
                    System.out.println("Mostrando de la tabla " + table + " el ID " + attributes);
                    return new CommandInfo(action, table, attributes.split(","));
                case "DELE":
                    // Realizar acción para DELE
                    System.out.println("Eliminando de la tabla " + table + " el ID " + attributes);
                    return new CommandInfo(action, table, attributes.split(","));
                default:
                    System.out.println("Comando desconocido: " + action);
            }
        } else {
            System.out.println("Comando inválido: " + command);
        }
        return null;
    }

    /*  public static boolean validateTable(String table) {
        return Tables.exist(table);
    }*/
    public static void validateTable(CommandInfo command) {
        String table = command.getTable();

        switch (table) {
            case "USUARIO":

                break;
            case "SERVICIO":

                break;
            case "CITA":

                break;
            case "TURNO":

                break;
            case "PAGO":

                break;
            case "CONSULTA":

                break;
            case "HISTORIAL":

                break;
            case "ESTADISTICA":

                break;
            default:
                throw new AssertionError();
        }

    }

    public static void sendUsuario(String accion, String[] attributos) {
        Usuario usuario;
        switch (accion) {
            case "LIST":

                break;
            case "INSE":

                break;
            case "EDIT":

                break;
            case "MOST":

                break;
            case "DELE":

                break;
        }
    }

    public static void sendServicio() {

    }

    public static void sendCita() {

    }

    public static void sendTurno() {

    }

    public static void sendPago() {

    }

    public static void sendConsulta() {

    }

    public static void sendHistorial() {

    }

    public static void sendEstadistica() {

    }
}
