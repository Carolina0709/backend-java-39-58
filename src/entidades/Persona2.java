/*
Implemente la clase Persona.
Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
constructor vacío, constructor parametrizado, get y set. 

Y los siguientes métodos:
    
     Agregar un método de creación del objeto que respete la siguiente firma:
        crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
        usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
        fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
        en cuenta que para conocer la edad de la persona también se debe conocer la fecha actual.
     Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad 
        y retorna true en caso de que el receptor tenga menor edad que la persona que se 
        recibe como parámetro, o false en caso contrario.
     Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
 */
package entidades;

import java.time.LocalDate;
import java.time.Period;

public class Persona2 {
    private String nombre;
    private LocalDate fechaNac;

    //Constructores
    public Persona2() {
    }
    public Persona2(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    //Nos retorna la edad del usuario guarado en el objeto. 
    public int calcularEdad(){
        LocalDate actual = LocalDate.now(); //Obtener fecha actual
        Period periodo = Period.between(fechaNac, actual); //Crea un perido de deferencia entre ambas fechas
        return periodo.getYears(); //funcion para devolver el periodo en anios
    }
    public boolean menorQue(int edad){
        return (calcularEdad()<edad) ? true : false;
    }
    
    public void mostrarPersona(){
        System.out.println("\nLos datos de la persona son los siguientes: "
                + "\nNombre:  " + nombre
                + "\nFecha Nacimiento " + fechaNac 
                + "\nEdad: " + calcularEdad());
        
    }
    
}
