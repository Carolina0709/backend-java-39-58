/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
     Constructor predeterminado o vacío
     Constructor con la capacidad máxima y la cantidad actual
     Métodos getters y setters.
     Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
     Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        cuanto quedó la taza.
     Método vaciarCafetera(): pone la cantidad de café actual en cero.
     Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
        recibe y se añade a la cafetera la cantidad de café indicada.
 */
package entidades;

import java.util.Scanner;


public class Cafetera {
    //Atributos
    private double maxima;
    private double actual;
    private int modelo;

    //Constructures
    public Cafetera() {
    }
    public Cafetera(double maxima, double actual, int modelo) {
        this.maxima = maxima;
        this.actual = actual;
        this.modelo = modelo;
    }
    
    //Setters
    public void setMaxima(double maxima) {
        this.maxima = maxima;
    }
    public void setActual(double actual) {
        this.actual = actual;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    //Getters
    public double getMaxima() {
        return maxima;
    }
    public double getActual() {
        return actual;
    }
    public int getModelo() {
        return modelo;
    }
    
    public void llenarCafetera(){
        if(actual != maxima){
            actual = maxima;
            System.out.println("\nLa cafetera " + modelo + " se lleno correctamente.");
        }else{
            System.out.println("\nLa cafetera " + modelo + " ya esta llena.");
        }
    }
    public void servirTaza(){
        Scanner leer = new Scanner(System.in);
        double taza;
        
        System.out.print("\nIngresa los litros de tu taza: ");
        taza= leer.nextDouble();
        
        if(taza > actual){
            System.out.println("\nCantidad de cafe insuficiente! "
                    + "\nLa taza se ha llenado solo con " + actual + " litros.");
        }else{
            System.out.println("\nTaza llena correctamente.");
            actual -= taza;
        }
        
    }
    public void mostrarActual(){
        System.out.println("\nLa cantidad actual de la cafetera " + modelo + " es: " + actual);
    }
    public void vaciarCafetera(){
        actual = 0;
        System.out.println("\nCafetera " + modelo + " vaciada correctamente. ");
    }
    
}
