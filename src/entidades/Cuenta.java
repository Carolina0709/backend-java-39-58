/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    b) Agregar los métodos getters y setters correspondientes
    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
        y se la sumara a saldo actual.
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
        la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
        pondrá el saldo actual en 0.
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
        usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package entidades;

import java.util.Scanner;


public class Cuenta {
    //Atributos
    private int numCuenta;
    private long dni;
    private double saldo;

    //Constructores
    public Cuenta() {
    }
    public Cuenta(int numCuenta, long dni, double saldo) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }
    
    //Getters
    public int getNumCuenta() {
        return numCuenta;
    }
    public long getDni() {
        return dni;
    }
    public double getSaldo() {
        return saldo;
    }
    
    //Setters
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    //Agregar un nuevo ingreso
    public void ingresar(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("\nCuanto dinero quieres ingresar? ");
        saldo = saldo+leer.nextDouble();
        System.out.println("\nIngreso exitoso.");
    }
    
    //Agrear un nuevo retiro
    public void retirar(){
        Scanner leer = new Scanner(System.in);
        double retiro;
        
        System.out.print("\nCuanto dinero quieres retirar? ");
        retiro = leer.nextDouble();
        
        if(retiro > saldo){
            saldo=0;
            System.out.println("\nRetiro insuficiente, la cuenta queda en ceros. ");
        }else{
            saldo = saldo - retiro;
            System.out.println("\nRetiro exitoso. ");
        }
        
    }
    public void extraccionRapida(){
        Scanner leer = new Scanner(System.in);
        double estraccion=0;
        
        while(estraccion>20 || estraccion < 1){
            System.out.println("\nIngresa el porcentaje de lo que deseas retirar 1-20");
            estraccion = leer.nextInt();
        }
        estraccion = saldo * (estraccion/100);
        if(estraccion > saldo){
            saldo=0;
            System.out.println("\nRetiro insuficiente, la cuenta queda en ceros. ");
        }else{
            saldo = saldo - estraccion;
            System.out.println("\nRetiro exitoso. ");
        }
      
    }
    
    public String consultarSaldo(){
        return "\nEl saldo de la cuenta " + numCuenta + " es el siguiente: $" + saldo;
    }
   
    public String consultarDatos() {
        return "\nLos datos de la cuenta son: " 
                + "\nNum Cuenta: " + numCuenta 
                + "\nDNI: " + dni 
                + "\nSaldo: " + saldo;
    }
    
    
}
