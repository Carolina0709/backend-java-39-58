/*
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
    que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
    en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
    nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
    al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
    se repite el encuentro.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

public class ServicioCurso {
    public static void cargarAlumnos(Curso curso){
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.print("Ingresa el nombre del alumno #" + (i+1) + ": ");
            curso.getAlumnos()[i] = leer.nextLine();
        }
    }
    public static Curso crearCurso(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa el nombre el curso: ");
        String nomCurso = leer.nextLine();
        System.out.print("Ingresa el turno (MATUTINO/VESPERTINO): ");
        String turno = leer.nextLine().toUpperCase();
        System.out.print("Ingresa el numero de horas por dia: ");
        int horasDia = leer.nextInt();
        System.out.print("Ingresa el numero de dias por semana: ");
        int diasSem = leer.nextInt();
        System.out.print("Ingresa el precio por hora: ");
        double precioHora = leer.nextDouble();
        
        Curso curso = new Curso(nomCurso, horasDia, diasSem, turno, precioHora);
        cargarAlumnos(curso);
        
        return curso;
        
    }
    public static double calcularGananciaSemanal(Curso curso){
        return curso.getDiasSem() * curso.getHorasDia() *
                curso.getPrecioHora() * curso.getAlumnos().length;
    }
    
    public static void mostrarInfoCurso(){
        Curso curso = crearCurso();
        System.out.println("\nLos detalles del curso son los siguientes: "
                + "\nNombre: " + curso.getNomCurso() 
                + "\nTurno: " + curso.getTurno()
                + "\nAlumnos: \n");
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println("Alumno #" + (i+1) + ": " + curso.getAlumnos()[i]);
        }
        System.out.println("\nGanancia Semanal: " + calcularGananciaSemanal(curso));
    }
}
