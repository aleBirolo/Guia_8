/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_04;

import Entidades.Pelicula;
import Servicios.PeliculaServicio;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaServicio ps=new PeliculaServicio();
        ArrayList<Pelicula> peliculas=ps.crearPeliculas();
        
        System.out.println("\n Peliculas ingresadas: ");
        ps.mostrarPeliculas(peliculas);
        
        System.out.println("\n Peliculas ingresadas que duran mas de 1 hora: ");
        ps.mostrarPeliculas(peliculas, 1);
        
        System.out.println("\n Peliculas ingresadas ordenadas por titulo: ");
        ps.ordenarPeliculas(peliculas, 'a');
        System.out.println("\n Peliculas ingresadas ordenadas por director: ");
        ps.ordenarPeliculas(peliculas, 'b');
        System.out.println("\n Peliculas ingresadas ordenadas por menor duracion: ");
        ps.ordenarPeliculas(peliculas, 'c');
        System.out.println("\n Peliculas ingresadas ordenadas por mayor duracion: ");
        ps.ordenarPeliculas(peliculas, 'd');
    }
    
}
