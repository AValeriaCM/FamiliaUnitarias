/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.familiaunitarias;

import java.util.HashMap;

/**
 *
 * @author Valeria Castañeda
 */
public class Persona {
    /**
     * Declaracion de variables
     */
    private String nombre;
    private int identificacion;
    private HashMap<Integer,Persona> mapaPersona;
    /**
     * Constructor de la clase
     * @param identificacion
     * @param nombre 
     */
    public Persona(int identificacion, String nombre) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        mapaPersona = new HashMap<>();
    }
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return 
     */
    public int getIdentificacion() {
        return identificacion;
    }
    /**
     * 
     * @param identificacion 
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    /**
     * 
     * @return 
     */
    public HashMap<Integer, Persona> getMapaPersona() {
        return mapaPersona;
    }
    /**
     * 
     * @param mapaPersona 
     */
    public void setMapaPersona(HashMap<Integer, Persona> mapaPersona) {
        this.mapaPersona = mapaPersona;
    }
    
    
    
}
