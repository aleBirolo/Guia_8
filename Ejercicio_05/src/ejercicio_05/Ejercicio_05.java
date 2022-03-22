/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_05;

import Entidades.Pais;
import Servicios.PaisServicio;
import java.util.TreeSet;

/**
 *
 * @author Alejandro
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaisServicio ps= new PaisServicio();
        TreeSet<Pais> paises = ps.crearPaises();
        
        ps.mostrarPaises(paises);
        ps.eliminarPais(paises);
        ps.mostrarPaises(paises);
    }
    
}
