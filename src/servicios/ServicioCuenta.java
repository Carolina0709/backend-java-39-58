package servicios;

import entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    //Crear una nueva cuenta
    public static Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa tu numero de cuenta: ");
        int numCuenta = leer.nextInt();

        System.out.print("Ingresa tu DNI: ");
        long dni = leer.nextLong();

        return new Cuenta(numCuenta, dni, 0);
    }

    public static void menuCuenta() {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        boolean banCuenta = true;
        int opCuenta;

        while (banCuenta) {
            System.out.println("\nElige una opcion: "
                    + "\n1. Crear cuenta. "
                    + "\n2. Ingresar. "
                    + "\n3. Retirar."
                    + "\n4. Extraccion rapida."
                    + "\n5. Consulta saldo. "
                    + "\n6. Consulta cuenta. "
                    + "\n7. Volver al menu. ");
            opCuenta = leer.nextInt();

            switch (opCuenta) {
                case 1:
                    cuenta = ServicioCuenta.crearCuenta();
                    continue;
                case 2:
                    cuenta.ingresar();
                    continue;
                case 3:
                    cuenta.retirar();
                    continue;
                case 4:
                    cuenta.extraccionRapida();
                    continue;
                case 5:
                    System.out.println(cuenta.consultarSaldo());
                    continue;
                case 6:
                    System.out.println(cuenta.consultarDatos());
                    continue;
                case 7:
                    System.out.println("\nListo! Volvemos al menu. ");
                    banCuenta = false;
                    break;
                default:
                    System.out.println("\nOpcion incorrecta!");
            }
        }
        //Al romper el while cuenta evitamos que continue con el siguente case y vuelve al while ban
    }

}
