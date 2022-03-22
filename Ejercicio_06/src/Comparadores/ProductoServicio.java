/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Alejandro Birolo
 */
public class ProductoServicio {
    private Scanner teclado ;
    HashMap<String, Double> productos;
    
    public  HashMap<String, Double> crearProductos(){
        
        teclado  = new Scanner(System.in).useDelimiter("\n");
        productos  = new HashMap();
        
        String nombre;
        Double precio;
        String opc;
       
        opc= String.valueOf('Y');
        
        while (opc.equals("Y")){
            
            System.out.print("Ingrese Nombre del Producto: ");
            nombre= teclado.next();
            
            System.out.print("Ingrese Precio del Producto: ");
            precio= teclado.nextDouble();
            
            productos.put(nombre, precio);
        
            System.out.print("Continue or exit? Y/N... ");
            opc= teclado.next();
        }
        
        return productos;
    }
    
    public void mostrarProductos(HashMap<String, Double> productos){
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            System.out.println("Producto: "+ key + ". Precio: "+ value);
        }
    }
    
    public void eliminarProducto(HashMap<String, Double> productos){
        
        String nombre;
        teclado  = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Ingrese Nombre del Producto a eliminar: ");
        nombre= teclado.next();
       
        productos.remove(nombre);
    }
    
    public void cambiarPrecio(HashMap<String, Double> productos){
        String nombre;
        Double precio;
        
        teclado  = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Ingrese Nombre del Producto a cambiar el precio: ");
        nombre= teclado.next();
        
        if (productos.containsKey(nombre))
        {
            System.out.print("Ingrese el nuevo precio: ");
            precio= teclado.nextDouble();

            productos.replace(nombre, precio);
        }
        else
            System.out.println("No se encontro el producto");
    }
}
