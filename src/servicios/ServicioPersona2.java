/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona2;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author caro9
 */
public class ServicioPersona2 {
    public static Persona2 crearPersona(){
        Scanner leer = new Scanner(System.in);
        String nom;
        int dia, mes, anio;
        
        System.out.print("Ingresa tu nombre completo: ");
        nom = leer.nextLine();
        
        System.out.println("\nIngresa los siguientes datos de tu fecha de nacimiento: "); 
        System.out.print("Dia: ");
        dia = leer.nextInt();
        System.out.print("Mes: ");
        mes = leer.nextInt();
        System.out.print("Año: ");
        anio = leer.nextInt();
        
        LocalDate fecha =  LocalDate.of(anio,mes, dia);
        
        return new Persona2(nom, fecha);
    }
    
    public static void mostrarDatos(Persona2 p){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa la edad que deseas comparar: ");
        System.out.println("\nEl objeto es menor a la persona a comparar: " + p.menorQue(leer.nextInt()));
        p.mostrarPersona();
 
    }
    
}
