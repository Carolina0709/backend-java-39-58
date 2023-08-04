/*
  Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
    instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
    números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package servicios;

import entidades.Movil;
import java.util.Scanner;

public class ServicioMovil {
    public static Movil cargarCelular(){
        Scanner leer = new Scanner(System.in);
                
        System.out.print("Ingresa la marca: ");
        String marca = leer.nextLine();
        System.out.print("Ingresa el modelo: ");
        String modelo = leer.nextLine();
        System.out.print("Ingresa el precio: ");
        double precio = leer.nextDouble();
        System.out.print("Ingresa el tamaño de RAM en GB: ");
        int ram = leer.nextInt();
        System.out.print("Ingresa el tamaño de almacenamiento en GB: ");
        int almacenamiento = leer.nextInt();
        
        Movil movil = new Movil(marca,modelo,precio,ram,almacenamiento);
        ingresarCodigo(movil);
        return movil;       
    }
    public static void ingresarCodigo(Movil movil){
        Scanner leer = new Scanner(System.in);
        System.out.println("\nIngresa tu codigo: ");
        for (int i = 0; i < movil.getCodigo().length; i++) {
            System.out.print("Posicion [" +(i+1)+"]: ");
            movil.getCodigo()[i] = leer.nextInt();
        }
    }
    
    public static void mostrarInfoMovil(){
        Movil movil = cargarCelular();
        
        System.out.println("\nLos datos del movil son los siguientes: "
                + "\nMarca: " + movil.getMarca()
                + "\nModelo: " + movil.getModelo()
                + "\nPrecio: " + movil.getModelo()
                + "\nRAM: " + movil.getRam()
                + "\nAlmacenamiento: " + movil.getAlmacenamiento());
        System.out.print("Codigo: ");
        for (int i = 0; i < movil.getCodigo().length; i++) {
            System.out.print("[" + movil.getCodigo()[i] + "]");
        }
        System.out.println("");
    }
}
