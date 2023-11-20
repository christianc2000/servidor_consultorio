/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacorreoconsultorio;

/**
 *
 * @author Christian
 */
import java.util.Scanner;
import java.util.regex.*;

public class SyntaxAnalyzer {

    private static final String COMMAND_PATTERN
            = "^([A-Z]+)\\[(.+)\\];$";
    private static final String LIST_PATTERN = "^\"([a-zA-Z]+)\"(:(\"[a-zA-Z]+\"(,\"[a-zA-Z]+\")*))?$";

    public static void parseCommand(String command) {
        Pattern pattern = Pattern.compile(COMMAND_PATTERN);
        Matcher matcher = pattern.matcher(command);

        if (matcher.find()) {
            String action = matcher.group(1);
            String consult = matcher.group(2);

            switch (action) {
                case "LIST":
                    // Realizar acción para LIST
                    System.out.println("Listando todos los elementos de la tabla " + consult);
                    Pattern listPattern = Pattern.compile(LIST_PATTERN);
                    Matcher listMatcher = listPattern.matcher(consult);
                    if (listMatcher.matches()) {
                        String table = listMatcher.group(1);
                        String attributes = listMatcher.group(2);
                        System.out.println("Sintaxis de consulta correcta: tabla="+table+", "+attributes);
                    } else {
                        System.out.println("Sintaxis de LIST inválida");
                    }
                    break;
                case "INSERT":
                    // Realizar acción para INSE
                    System.out.println("Insertando en la tabla " + consult);
                //return new CommandInfo(action, table, attributes.split(","));
                case "UPDATE":
                    // Realizar acción para EDIT
                    System.out.println("Editando en la tabla " + consult);
                    break;
                case "SHOW":
                    // Realizar acción para MOST
                    System.out.println("Mostrando de la tabla " + consult);
                    //return new CommandInfo(action, table, attributes.split(","));
                    break;
                case "DELETE":
                    // Realizar acción para DELE
                    System.out.println("Eliminando de la tabla " + consult);
                    //return new CommandInfo(action, table, attributes.split(","));
                    break;
                default:
                    System.out.println("Comando desconocido: " + action);
            }
        } else {
            System.out.println("Comando inválido");
        }
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, introduce un comando:");
            String command = scanner.nextLine();
            parseCommand(command);
        }
    }
}
