/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PerroServicio {
    
    private Scanner teclado ;
    ArrayList<String> perros;
    
    public void fabricarPerros(){
        
        teclado  = new Scanner(System.in).useDelimiter("\n");
        perros= new ArrayList<>();
        String cad;
        String opc;
        
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
        
    }
}
