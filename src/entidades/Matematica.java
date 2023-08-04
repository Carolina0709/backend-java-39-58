/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
        elevado al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package entidades;


public class Matematica {
    //Atributos
    private double num1;
    private double num2;
    
    //Constructores
    public Matematica() {
    }
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //Getters
    public double getNum1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    
    //Setters
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    //Devuelve el numero mayor
    public double devolverMayor(){
        return Math.max(num1, num2);
    }
    
    //Potencia del mayor elevado al menor previamente redondeados
    public double calcularPotencia(){
        return Math.pow(Math.round(Math.max(num1, num2)), Math.round(Math.min(num1, num2)));
    }
    
    //Carcular raiz cuadrada del valor absoluto del menor numero
    public double calculaRaiz(){
        return Math.sqrt(Math.abs(Math.round(Math.min(num1, num2))));
    }
    
}
