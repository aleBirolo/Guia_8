/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Alejandro Birolo
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarPeliculaTituloAsc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo()); 
        }
        
    };
    
    public static Comparator<Pelicula> ordenarPeliculaDirectorAsc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector()); 
        }
        
    };
    
    public static Comparator<Pelicula> ordenarPeliculaDuracionAsc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Integer.compare(p1.getDuracion(), p2.getDuracion());
        }
        
    };
   
    public static Comparator<Pelicula> ordenarPeliculaDuracionDesc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Integer.compare(p2.getDuracion(), p1.getDuracion());
        }
        
    };
    
}
