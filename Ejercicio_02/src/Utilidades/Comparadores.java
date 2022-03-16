/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.Comparator;

/**
 *
 * @author Alejandro Birolo
 */
public class Comparadores {

    public static Comparator<String> ordenarCadenaAsc = new Comparator<String>(){
        @Override
        public int compare(String t, String t1) {
           return t.compareTo(t1);
        }
        
    };
    
    
}
