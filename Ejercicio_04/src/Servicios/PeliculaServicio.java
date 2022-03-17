/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import static Utilitarios.Comparadores.ordenarPeliculaDirectorAsc;
import static Utilitarios.Comparadores.ordenarPeliculaDuracionAsc;
import static Utilitarios.Comparadores.ordenarPeliculaDuracionDesc;
import static Utilitarios.Comparadores.ordenarPeliculaTituloAsc;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class PeliculaServicio {
    private Scanner teclado ;
    ArrayList<Pelicula> peliculas;
    
    public ArrayList<Pelicula> crearPeliculas(){
        
        teclado  = new Scanner(System.in).useDelimiter("\n");
        peliculas  = new ArrayList<>();
        
        String titulo;
        String director;
        int duracion;
        String opc;
       
        opc= String.valueOf('Y');
        
        while (opc.equals("Y")){
            
            System.out.print("Ingrese Titulo de la Pelicula: ");
            titulo= teclado.next();
            
            System.out.print("Ingrese el nombre del director de la pelicula: ");
            director= teclado.next();
            
            System.out.print("Ingrese la duracion de la Pelicula: ");
            duracion= teclado.nextInt();
            
            peliculas.add(new Pelicula(titulo, director, duracion));
            
            System.out.print("Continue or exit? Y/N... ");
            opc= teclado.next();
        }
        
        return peliculas;
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas, int dur){
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion()>dur)
                System.out.println(pelicula);
        }
    }
    
    public void ordenarPeliculas(ArrayList<Pelicula> peliculas, char criterio){
        
        switch(criterio){
            case 'a':
                peliculas.sort(ordenarPeliculaTituloAsc);
                break;
            case 'b':
                peliculas.sort(ordenarPeliculaDirectorAsc);
                break;
            case 'c':
                peliculas.sort(ordenarPeliculaDuracionAsc);
                break;
            case 'd':
                peliculas.sort(ordenarPeliculaDuracionDesc);
                break;
            default:
                break;
        }
        
        mostrarPeliculas(peliculas);
    }
    
    
}
