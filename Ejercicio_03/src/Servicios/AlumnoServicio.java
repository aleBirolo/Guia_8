/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class AlumnoServicio {
    
    private Scanner teclado ;
    ArrayList<Alumno> alumnos;
    ArrayList<Integer> notas;
    private static final int TAMNOTAS = 3;
    
   
//    public Alumno crearAlumno(){
//        String nom;
//        teclado  = new Scanner(System.in).useDelimiter("\n");
//        
//        System.out.print("Ingrese Nombre del alumno: ");
//        nom= teclado.next();
//        
//        return new Alumno(nom);
//    }
    
    public ArrayList<Alumno> crearAlumnos(){
        teclado  = new Scanner(System.in).useDelimiter("\n");
        alumnos  = new ArrayList<>();
        notas = new ArrayList<>(TAMNOTAS);
        
        String nom;
        String opc;
       
        boolean flag;
        flag = false;
        
        opc= String.valueOf('Y');
        
        while (opc.equals("Y")){
            
            System.out.print("Ingrese Nombre del alumno: ");
            nom= teclado.next();
           
            for (int i = 1; i <= TAMNOTAS; i++) {
                System.out.print("Ingrese Nota "+ i +": ");
                notas.add(teclado.nextInt());
            }
            
            alumnos.add(new Alumno(nom,notas));
            notas= new ArrayList<>(TAMNOTAS);
           
            System.out.print("Continue or exit? Y/N... ");
            opc= teclado.next();
        }
        
        return alumnos;
    }
    
    
    public void mostrarAlumnos(ArrayList<Alumno> alumnos){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
//    public boolean buscarAlumno(ArrayList<Alumno> alumnos, Alumno alum){
//        
//        for (Alumno alumno : alumnos) {
//            if (alumno.equals(alum))
//                return true;
//        }
//        
//        return false;
//    }
    
    public Alumno buscarAlumno(ArrayList<Alumno> alumnos, String alum){
        
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(alum))
                return alumno;
        }
        
        return null;
    }
    
    public double notaFinal(Alumno alum){
        notas= alum.getNotas();
        double promedio;
        promedio=0;
        for (int i = 0; i < TAMNOTAS; i++) {
            promedio+=notas.get(i);
        }
        
        return promedio/TAMNOTAS;
    }
}
