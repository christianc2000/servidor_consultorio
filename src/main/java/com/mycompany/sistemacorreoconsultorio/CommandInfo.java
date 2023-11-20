/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacorreoconsultorio;

/**
 *
 * @author Christian
 */
public class CommandInfo {

    private final String action;
    private final String table;
    private final String[] attributes;

    public CommandInfo(String action, String table, String[] attributes) {
        this.action = action;
        this.table = table;
        this.attributes = attributes;
    }

    public String getAction() {
        return action;
    }

    public String getTable() {
        return table;
    }

    public String[] getAttributes() {
        return attributes;
    }

}
