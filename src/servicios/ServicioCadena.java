package servicios;

import entidades.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    public static void menuCadena() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena cadena = new Cadena();
        boolean ban = true;
        int op;

        System.out.print("Ingresa una cadena: ");
        cadena.setFrase(leer.nextLine());
        cadena.setLongFrase(cadena.getFrase().length());

        while (ban) {
            System.out.println("\nElige una opcion: "
                    + "\n1. Cantidad de vocales. "
                    + "\n2. Invertir frase. "
                    + "\n3. Caracter repetido."
                    + "\n4. Comparar longitudes. "
                    + "\n5. Unir frases."
                    + "\n6. Remplazar A's."
                    + "\n7. Contiene letra."
                    + "\n8. Volver al menu. ");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nDentro de la frase hay " + cadena.mostrarVocales() + " vocales");
                    continue;
                case 2:
                    cadena.invertirFrase();
                    continue;
                case 3:
                    System.out.print("\nIngresa un caracter: ");
                    leer.nextLine();
                    String letra = leer.nextLine();
                    System.out.println("\nDentro de la frase el caracter [" +letra+ "] se encuentra " 
                            + cadena.vecesRepetido(letra) + " veces");
                    continue;
                case 4:
                    System.out.print("Ingresa una nueva frase: ");
                    leer.nextLine();
                    System.out.println("\n"+cadena.compararLongitud(leer.nextLine()));
                    continue;
                case 5:
                    System.out.print("Ingresa una nueva frase: ");
                    leer.nextLine();
                    System.out.println("\nLa nueva frase es: \n" + cadena.unirFrases(leer.nextLine()));
                    continue;
                case 6:
                    System.out.print("Ingresa el caracter por el cual deseas remplazar las A's: ");
                    leer.nextLine();
                    System.out.println("\nLa nueva frase es: \n" + cadena.reemplazar(leer.nextLine()));
                    continue;
                case 7:
                    System.out.print("Ingresa la letra a buscar: ");
                    leer.nextLine();
                    System.out.println("La letra se encuentra en la frase: " + cadena.contiene(leer.nextLine()));
                    continue;
                case 8:
                    System.out.println("\nListo! Volvemos al menu. ");
                    ban = false;
                    break;
                default:
                    System.out.println("\nOpcion incorrecta!");
            }
        }

    }
}
