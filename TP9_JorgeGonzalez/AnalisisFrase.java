import java.util.Scanner;

/**
 * Nombre: Jorge Gonzalez
 * Tp: 9
 * Enunciado:
 * Escribir un programa que permita ingresar por teclado una frase y cuente la
 * cantidad de palabras, vocales, consonantes y simbolos. Utilizar un vector para
 * almacenar los resultados. Imprimir todos los resultados.
 */

class AnalisisFrase {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = teclado.nextLine();

        int[] resultados = new int[4];

        // resultados[0] = palabras
        // resultados[1] = vocales
        // resultados[2] = consonantes
        // resultados[3] = simbolos

        resultados[0] = contarPalabras(frase);
        resultados[1] = contarVocales(frase);
        resultados[2] = contarConsonantes(frase);
        resultados[3] = contarSimbolos(frase);

        System.out.println("La frase ingresada es: " + frase);
        System.out.println("Cantidad de palabras: " + resultados[0]);
        System.out.println("Cantidad de vocales: " + resultados[1]);
        System.out.println("Cantidad de consonantes: " + resultados[2]);
        System.out.println("Cantidad de simbolos: " + resultados[3]);
    }

    public static int contarPalabras(String frase) {

        int contador = 0;
        boolean dentroPalabra = false;

        for (int i = 0; i < frase.length(); i++) {

            char c = frase.charAt(i);

            if (c != ' ') {
                if (!dentroPalabra) {
                    contador++;
                    dentroPalabra = true;
                }
            } else {
                dentroPalabra = false;
            }
        }

        return contador;
    }

    public static int contarVocales(String frase) {

        int cantidadVocales = 0;

        for (int i = 0; i < frase.length(); i++) {

            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cantidadVocales++;
            }
        }

        return cantidadVocales;
    }

    public static int contarConsonantes(String frase) {

        int cantidadConsonantes = 0;

        for (int i = 0; i < frase.length(); i++) {

            char letra = Character.toLowerCase(frase.charAt(i));

            if (letra >= 'a' && letra <= 'z') {

                if (!(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')) {
                    cantidadConsonantes++;
                }
            }
        }

        return cantidadConsonantes;
    }

    public static int contarSimbolos(String frase) {

        int cantidadSimbolos = 0;

        for (int i = 0; i < frase.length(); i++) {

            char c = frase.charAt(i);

            if (!Character.isLetter(c) && c != ' ') {
                cantidadSimbolos++;
            }
        }

        return cantidadSimbolos;
    }

}