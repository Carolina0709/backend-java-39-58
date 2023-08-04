/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package entidades;

public class Circunferencia {

    
    //Atributos
    private double radio;
    
    //Constructores
    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    //metodo set
    public void setRadio(double radio) {
        this.radio = radio;
    }
    //metodo get
    public double getRadio() {
        return radio;
    }
    
    //Metodo que obtiene el area del circulo
    public double area(){
        return Math.PI * Math.pow(radio, 2); 
    }
    //Metodo que obtiene el diametro del circulo
    public double perimetro(){
        return 2 * Math.PI * radio;
       
    }
}
