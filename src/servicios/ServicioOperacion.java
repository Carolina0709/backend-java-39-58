/*

 */
package servicios;

import entidades.Operacion;
import java.util.Scanner;


public class ServicioOperacion {
    public static Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa el numero 1: ");
        double num1 = leer.nextDouble();
        
        System.out.print("Ingresa el numero 2: ");
        double num2 = leer.nextDouble();
        
        return new Operacion(num1, num2);
        
    }
    
    public static void mostrarOperaciones(Operacion operacion){
        System.out.println("\nLa suma es: "+ operacion.sumar());
        System.out.println("La resta es: "+ operacion.restar());
        System.out.println("La multiplicacion es: "+ operacion.multiplicar());
        System.out.println("La division es: "+ operacion.dividir());
    }
}
