
package servicios;

import entidades.Rectangulo;
import java.util.Scanner;


public class ServicioRectangulo {
    //Crea rectangulo
    public static Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa la base: ");
        int base = leer.nextInt();
        
        System.out.print("Ingres la altura: ");
        int altura = leer.nextInt();
        
        return new Rectangulo(base, altura);
        
    }
    
    //Dibuja el rectangulo
    public static void dibujaRec(Rectangulo rec){
        System.out.println("\nEl rectangulo es el siguiente: \n");
        for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
                if(j == 0 || j == rec.getBase()-1 || i == 0 || i == rec.getAltura()-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void mostrarDatos(Rectangulo rec){
        System.out.println("\nEl area es: " + rec.area());
        System.out.println("El perimetro es: "+ rec.perimetro());
        ServicioRectangulo.dibujaRec(rec);
    }
    
}
