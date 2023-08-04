/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();

 */
package servicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


/**
 *
 * @author caro9
 */
public class ServicioDate {

    public static void crearFechas(){
        Scanner leer = new Scanner(System.in);
        
        int dia, mes, anio;
        
        System.out.print("Ingresa el dia: ");
        dia = leer.nextInt();
        System.out.print("Ingresa el mes: ");
        mes = leer.nextInt();
        System.out.print("Ingresa el año: ");
        anio = leer.nextInt();
        
        LocalDate fecha =  LocalDate.of(anio,mes, dia);
        LocalDate actual = LocalDate.now();
        
        System.out.println("\nLa fecha actual es: " + actual);
        System.out.println("La fecha ingresa es: " + fecha);
        
        Period periodo = Period.between(fecha, actual); //Crea un perido de deferencia entre ambas fechas
        int diferenciaAnios = periodo.getYears(); //funcion para devolver el periodo en anios
        
        System.out.println("\nY hay " + diferenciaAnios + " años de diferencia entre ambas fechas" );
    }
    
  
}
