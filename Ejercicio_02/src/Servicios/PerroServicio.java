/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import static Utilidades.Comparadores.ordenarCadenaAsc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PerroServicio {
    
    private Scanner teclado ;
    ArrayList<String> perros;
    Iterator<String> iterador;
    
    public void fabricarPerros(){
        
        teclado  = new Scanner(System.in).useDelimiter("\n");
        perros= new ArrayList<>();
        
        String cad;
        String opc;
        String perroABuscar;
        boolean flag;
        flag = false;
        
        opc= String.valueOf('Y');
        
        while (opc.equals("Y")){
            
            System.out.print("Ingrese Raza de Perro: ");
            cad= teclado.next();
            perros.add(cad);
            
            System.out.print("Continue or exit? Y/N... ");
            opc= teclado.next();
        }
        
        System.out.println("La razas ingresadas fueron: ");
        
        perros.forEach((perro) -> {
            System.out.println(perro);
        });
        
        System.out.print("\nIngrese una Raza de Perro a buscar: ");
        perroABuscar= teclado.next();
        iterador = perros.iterator();
        while (iterador.hasNext()) {
          
            if (perroABuscar.equals(iterador.next())){
                System.out.println("\nSe encontro la raza de perro en la lista. \n Se procede a eliminarla");
                iterador.remove();
                flag=true;
            }
        }
        
        if (!flag){
            System.out.println("\nNo se encontro la raza de perro en la lista");
        }
        
        perros.sort(ordenarCadenaAsc);
        
        perros.forEach((perro) -> {
            System.out.println(perro);
        });
    }
    
    
}

