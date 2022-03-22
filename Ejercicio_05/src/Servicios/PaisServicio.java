/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Pais;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Alejandro Birolo
 */
public class PaisServicio {
    private Scanner teclado ;
    TreeSet<Pais> paises;
    
    public TreeSet<Pais> crearPaises(){
        
        teclado  = new Scanner(System.in).useDelimiter("\n");
        paises  = new TreeSet();
        
        String nombre;
        String opc;
       
        opc= String.valueOf('Y');
        
        while (opc.equals("Y")){
            
            System.out.print("Ingrese Nombre del Pais: ");
            nombre= teclado.next();
            
            
            paises.add(new Pais(nombre));
        
            System.out.print("Continue or exit? Y/N... ");
            opc= teclado.next();
        }
        
        return paises;
    }
    
    public void mostrarPaises(TreeSet<Pais> paises){
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }
    
    public void eliminarPais(TreeSet<Pais> paises){
        String nombre;
        teclado  = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Ingrese Nombre del Pais: ");
        nombre= teclado.next();
        
        Pais paisAElim = new Pais(nombre);
        
        if (paises.remove(paisAElim) == true)
            System.out.println("Pais eliminado");
       else
            System.out.println("No se encuentra el pais.");
    }
    
}
