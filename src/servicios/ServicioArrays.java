/*

 */
package servicios;

import entidades.Arreglos;


public class ServicioArrays {
    public static void mostrarDatos(){
        Arreglos arre = new Arreglos();
        
        arre.inicializarA();
        arre.mostrarArreglo(arre.getA());
        arre.ordenaA();
        arre.rellenaB();
        
        System.out.println("\nArreglo A ");
        arre.mostrarArreglo(arre.getA());
        System.out.println("\nArreglo B ");
        arre.mostrarArreglo(arre.getB());
    }
}
