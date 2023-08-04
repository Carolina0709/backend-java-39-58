
package servicios;

import entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {
    //Metodo para crear un nuevo libro
    public static Libro ingresarLibro(){
        Scanner leer = new Scanner(System.in);

        System.out.println("\nIngresa los siguientes datos del libro: ");
        System.out.print("ISBN: ");
        String ISBN = leer.nextLine();
        System.out.print("Titulo: ");
        String titulo = leer.nextLine();
        System.out.print("Autor: ");
        String autor = leer.nextLine();
        System.out.print("Paginas: ");
        int numPaginas = leer.nextInt();
 
       return new Libro(ISBN, titulo, autor, numPaginas);
    }
    
     
    //Metodo para mostrar el libro
    public static void imprimeLibro(Libro libro){
        System.out.println("\nLas caracteristicas del libro son las siguientes: "
                + "\nISBN: " + libro.getISBN()
                + "\nTitulo: " + libro.getTitulo()
                + "\nAutor: " + libro.getAutor()
                + "\nPaginas: " + libro.getNumPaginas());
        
    }
    
}
