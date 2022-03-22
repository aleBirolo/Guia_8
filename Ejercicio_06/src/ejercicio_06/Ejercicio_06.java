/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_06;

import Comparadores.ProductoServicio;
import java.util.HashMap;

/**
 *
 * @author Alejandro
 */
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoServicio ps= new ProductoServicio() ;
        HashMap<String, Double> productos = ps.crearProductos();
        
        ps.mostrarProductos(productos);
        ps.eliminarProducto(productos);
        ps.mostrarProductos(productos);
        ps.cambiarPrecio(productos);
        ps.mostrarProductos(productos);
    }
    
}
