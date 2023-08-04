package servicios;

import entidades.Matematica;

public class ServicioMatematica {

    public static Matematica crear() {
        Matematica matematica = new Matematica();
        matematica.setNum1(Math.random()*10);
        matematica.setNum2(Math.random()*10);

        return matematica;

        //Lo anterior puede simplificarse de la siguiente manera 
        //return new Matematica(Math.random(), Math.random());
        //Pero usamos las lineas de arriba por decision del programa. 
    }

    public static void mostrarDatos(Matematica m) {
        System.out.println("\nLos datos de la clase son los siguientes: "
                + "\n\nEl numero 1 es: " + m.getNum1()
                + "\nEl numero 2 es: " + m.getNum2()
                + "\nEl numero mayor es: " + m.devolverMayor()
                + "\nLa potencia del mayor elevado al menor (ambos redondeados +) es: " + m.calcularPotencia()
                + "\nLa raiz cuadrada del menor (redondeado +) es: " + m.calculaRaiz());
    }
}
