package servicios;

import entidades.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    public static Cafetera crearCafetera() {
        Scanner leer = new Scanner(System.in);
        double maximos;
        int modelo;
        
        System.out.print("\nIngresa los litros maximos de la cafetera: ");
        maximos = leer.nextDouble();
        System.out.print("\nIngresa el modelo: ");
        modelo = leer.nextInt();
        
        return new Cafetera(maximos, 0, modelo);
    }

    public static void menuCafetera() {
        Scanner leer = new Scanner(System.in);
        Cafetera cafetera = new Cafetera();
        boolean ban= true;
        int op;

        while (ban) {
            System.out.println("\nElige una opcion: "
                    + "\n1. Crear cafetera. "
                    + "\n2. Llenar cafetera. "
                    + "\n3. Servir taza."
                    + "\n4. Vaciar cafetera. "
                    + "\n5. Mostrar cantidad actual."
                    + "\n6. Volver al menu. ");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    cafetera = ServicioCafetera.crearCafetera();
                    continue;
                case 2:
                    cafetera.llenarCafetera();
                    continue;
                case 3:
                    cafetera.servirTaza();
                    continue;
                case 4:
                    cafetera.vaciarCafetera();
                    continue;
                case 5:
                    cafetera.mostrarActual();
                    continue;
                case 6:
                    System.out.println("\nListo! Volvemos al menu. ");
                    ban = false;
                    break;
                default:
                    System.out.println("\nOpcion incorrecta!");
            }
        }
    }
}
