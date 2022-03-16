/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03;

import Entidades.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoServicio as= new AlumnoServicio();
        ArrayList<Alumno> alumnos= as.crearAlumnos();
        Alumno alum;
        double notaFinal;
        String nombre;
        Scanner teclado  = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("\nLos alumnos ingresador fueron: ");
        as.mostrarAlumnos(alumnos);
        
        //alum=as.crearAlumno();
        
        System.out.print("Ingrese Nombre del alumno: ");
        nombre= teclado.next();
        
        alum=as.buscarAlumno(alumnos, nombre);
        
       if (alum != null){
           notaFinal= as.notaFinal(alum);
           System.out.println(alum + "Nota Final: " + notaFinal);
       }
       else{
           System.out.println("No se encontro el alumno");
       }
        
        
    }
    
}
