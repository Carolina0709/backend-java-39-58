/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package entidades;


public class Rectangulo {
    //Atributos
    private int base, altura;
    
    //Constructures
    public Rectangulo() {
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Setters
    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Getters
    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
    
    
    //Obtener la superficie
    public int area(){
        return base * altura;
    }
    
    //Obtener el perimetro
    public int perimetro(){
        return (base * 2) + (altura* 2);
    }
    
    
    
}
