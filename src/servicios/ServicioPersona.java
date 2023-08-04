package servicios;

import entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    public static Persona crearPersona() {
        Scanner leer = new Scanner(System.in);

        Persona persona = new Persona();

        persona.setSexo("");
        //Importante! poner la negacion despues de hacer el O en todos para que funcione
        //sino la condicion se cumpliria todo el tiempo. 
        while (!(persona.getSexo().equals("H") || persona.getSexo().equals("M") || persona.getSexo().equals("O"))) {
            System.out.print("Ingresa tu genero: H|M|0 ");
            persona.setSexo(leer.nextLine().toUpperCase());
        }
        System.out.print("Ingresa tu peso: (en kg)");
        persona.setPeso(leer.nextDouble());

        System.out.print("Ingresa tu altura: ");
        persona.setAltura(leer.nextDouble());

        persona.esMayorDeEdad();

        return persona;
    }

    public static void mostrarDatosPersonas(Persona[] arrayPersonas) {
        Persona persona = new Persona();
        int pesoBajo = 0, pesoNormal = 0, pesoArriba = 0;
        int menorEdad = 0, mayorEdad = 0;

        for (int i = 0; i < arrayPersonas.length; i++) {
            arrayPersonas[i] = ServicioPersona.crearPersona();
            arrayPersonas[i].calcularIMC();
            switch (arrayPersonas[i].calcularIMC()) {
                case -1:
                    pesoBajo++;
                    break;
                case 0:
                    pesoNormal++;
                    break;
                case 1:
                    pesoArriba++;
                    break;
            }
            if (arrayPersonas[i].getEdad() == true) {
                mayorEdad++;
            } else {
                menorEdad++;
            }
        }
        System.out.println("\nLas estadisticas son las siguientes: "
                + "\nPersonas debajo de su peso: " + pesoBajo
                + "\nPersonas con peso normal: " + pesoNormal
                + "\nPersonas con sobrepeso: " + pesoArriba
                + "\n\nPersonas mayores de edad: " + mayorEdad
                + "\nPersonas menores de edad: " + menorEdad);
    }
}
