/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
        frase ingresada.
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
        ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
        contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
            Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
        compone la clase con otra nueva frase ingresada por el usuario.
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
        con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
        encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
        la frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
        ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package entidades;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Cadena {
    //Atributos
    private String frase;
    private int longFrase;
    
    //Constructor
    public Cadena() {
    }
    public Cadena(String frase, int longFrase) {
        this.frase = frase;
        this.longFrase = longFrase;
    }
    
    
    //Setters
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }
    
    //Getters
    public String getFrase() {
        return frase;
    }
    public int getLongFrase() {
        return longFrase;
    }
    
    
    //Devuelve la cantidad de vocales
    public int mostrarVocales(){
        int numVocales = 0;
        
        Pattern pattern = Pattern.compile("[AEIOUaeiou]");
        Matcher matcher = pattern.matcher(frase);

        while(matcher.find()){
            numVocales++;
        }
  
        return numVocales;
    }
    //Imprime la frase pero al reves
    public void invertirFrase(){
        System.out.println("\nLa frase al reves es: ");
        for (int i = longFrase-1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println("");
    }
    //Devuelve el numero de incidencias de un caracter
    public int vecesRepetido(String letra){
        int aparece = 0;
        
        Pattern pattern = Pattern.compile(letra.toUpperCase());
        Matcher matcher = pattern.matcher(frase.toUpperCase());
       
        while(matcher.find()){
            aparece++;
        }
  
        return aparece;
    }
    //Devuelve si la longitud de ambas frases es igual o no
    public String compararLongitud(String newFrase){
        return (newFrase.length() == longFrase) ? "La longitud de ambas frases es igual" : "La longitud de ambas frases es diferente";
    }
    
    //Devuelve ambas frases en una misma
    public String unirFrases(String newFrase){
        return frase.concat(" " + newFrase);
    }
    
    //Remplazar letra por caracter ingresados por el usuario
    public String reemplazar(String caracter){
        return frase.replaceAll("[aA]", caracter); //Uso regex para que tome en encuenta las A mayusculas y minusculas
    }
    //Devuelve true o false si la letra ingresada por el usuario se encuentra
    public boolean contiene(String letra){
        //expresion regular .* letra .* indica si la letra esta dentro de la cadena
        return Pattern.matches(".*"+letra+".*", frase);
    }
}   
