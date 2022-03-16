/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author Alejandro Birolo
 */
public class Perro {
    private String raza;
    
    public Perro() {
        this.raza = "Callejero";
    }
    
    public Perro(String raza) {
        this.raza = raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
    
}
