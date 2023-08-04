/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package entidades;

import java.util.Arrays;

public class Arreglos {
    private double[] A = new double[50];
    private double[] B = new double[20];

    //Getters
    public double[] getA() {
        return A;
    }
    public double[] getB() {
        return B;
    }

    public void inicializarA(){
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.round(Math.random()*100);
        }
        System.out.println("\nArray A inicializado correctamente. \n");
    }
    public void ordenaA(){
        Arrays.sort(A);
        System.out.println("\n\nArray A ordenado correctamente. \n");
    }
    
    public void rellenaB(){
        for (int i = 0; i < 10; i++) {
            B[i] = A[i];
        }
        Arrays.fill(B, 10, 20, 0.5);
        
    }
    public void mostrarArreglo(double[] arre){
        System.out.println("El arreglo es el siguiente: ");
        for(double elementos: arre){
            System.out.print("[" +elementos+"] ");
        }
        System.out.println("");
    }
}
