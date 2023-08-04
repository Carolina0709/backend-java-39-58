/*
Clase principal que manda a llamar todas las clases de los ejercicios de la guia 8
 */
package ej_encuentro_39_58;

import entidades.Rectangulo;
import entidades.Persona;
import entidades.Operacion;
import entidades.Libro;
import entidades.Circunferencia;
import entidades.Matematica;
import entidades.Persona2;
import java.util.Scanner;
import servicios.ServicioArrays;
import servicios.ServicioCadena;
import servicios.ServicioCafetera;
import servicios.ServicioCircunferencia;
import servicios.ServicioCuenta;
import servicios.ServicioCurso;
import servicios.ServicioDate;
import servicios.ServicioLibro;
import servicios.ServicioMatematica;
import servicios.ServicioMovil;
import servicios.ServicioOperacion;
import servicios.ServicioPersona;
import servicios.ServicioPersona2;
import servicios.ServicioRectangulo;


public class Ej_encuentro_39_58 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        boolean ban = true;
        int op;

        while (ban) {
            System.out.println("\nElije una opcion: "
                    + "\n1.  Ejercicio Libro."
                    + "\n2.  Ejercicio Circunferencia."
                    + "\n3.  Ejercicio Operacion."
                    + "\n4.  Ejercicio Rectangulo."
                    + "\n5.  Ejercicio Cuenta. "
                    + "\n6.  Ejercicio Cafetera. "
                    + "\n7.  Ejercicio Persona. "
                    + "\n8.  Ejercicio Cadena. "
                    + "\n9.  Ejercicio Matematica."
                    + "\n10. Ejercicio Arreglos."
                    + "\n11. Ejercicio Date. "
                    + "\n12. Ejercicio Persona 2."
                    + "\n13. Ejercicio Curso."
                    + "\n14. Ejercivio Movil."
                    + "\n15. Salir");
            op = leer.nextInt();

            switch (op) {
                case 1: {//Primer ejercio Clase Libro
                    Libro libro = ServicioLibro.ingresarLibro();
                    ServicioLibro.imprimeLibro(libro);
                    continue;
                }
                case 2: {//Segundo ejercicio Clase Circunferencia
                    Circunferencia circulo = ServicioCircunferencia.crearCircunferencia();
                    ServicioCircunferencia.mostrarInfo(circulo);
                    continue;
                }
                case 3: {//Tercer ejercicio Clase Operacion 
                    Operacion operacion = ServicioOperacion.crearOperacion();
                    ServicioOperacion.mostrarOperaciones(operacion);
                    continue;
                }
                case 4:{//Cuarto Ejercicio Clase Rectangulo
                    Rectangulo rec = ServicioRectangulo.crearRectangulo();
                    ServicioRectangulo.mostrarDatos(rec);
                    continue;
                }
                case 5:{//Quinto Ejercicio Clase Cuenta
                    ServicioCuenta.menuCuenta();
                    continue;
                }
                case 6:{//Sexto Ejercicio Clase Cafetera
                    ServicioCafetera.menuCafetera();
                    continue;
                }
                case 7: {
                    Persona[] arrayPersonas= new Persona[4];
                    ServicioPersona.mostrarDatosPersonas(arrayPersonas);
                    continue;
                }
                case 8:{
                    ServicioCadena.menuCadena();
                    continue;
                }
                case 9:{
                    Matematica matematica = ServicioMatematica.crear();
                    ServicioMatematica.mostrarDatos(matematica);
                    continue;
                }
                case 10:{
                    ServicioArrays.mostrarDatos();
                    continue;
                }
                case 11:{
                    ServicioDate.crearFechas();
                    continue;
                }
                case 12:{
                    Persona2 p = ServicioPersona2.crearPersona();
                    ServicioPersona2.mostrarDatos(p);
                    continue;
                }
                case 13:{
                    ServicioCurso.mostrarInfoCurso();
                    continue;
                }
                case 14:{
                    ServicioMovil.mostrarInfoMovil();
                    continue;
                } 
                case 15:{//Opcion salir.
                    System.out.println("Nos vemos");
                    ban = false;
                    continue;
                }
                default: System.out.println("Opcion incorrecta! Intenta nuevamente. ");
            }
        }

    }
    
    

}
