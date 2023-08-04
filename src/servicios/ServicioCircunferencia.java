/*

 */
package servicios;

import entidades.Circunferencia;
import java.util.Scanner;


public class ServicioCircunferencia {
    //Metodo que permite obtener obtener el radio de teclado y para despues guardarlo en el objeto
    public static Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa el radio del circulo: ");     
        return new Circunferencia(leer.nextDouble());
        
    }
    
    public static void mostrarInfo(Circunferencia circulo){
        System.out.println("\nSu area es: " + circulo.area());
        System.out.println("Su perimetro es: " + circulo.perimetro());
    }
}
