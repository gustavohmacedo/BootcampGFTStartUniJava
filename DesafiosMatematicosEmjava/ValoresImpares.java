package DesafiosMatematicosEmjava;

import java.util.Scanner;

public class ValoresImpares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt(); // Ex: X = 8 ou X = 9
        int contadorSeNumeroPar = 1;
        int contadorSeNumeroImpar = 0;

        if (X % 2 == 0) { // se valor de entrada for par.

            for (int i = 0; i < 6; i++) {
                System.out.println(X + contadorSeNumeroPar);
                contadorSeNumeroPar = contadorSeNumeroPar + 2;
            }
        } else { // se valor de entrada for impar.
            for (int j = 0; j < 6; j++) {
                System.out.println(X + contadorSeNumeroImpar);
                contadorSeNumeroImpar = contadorSeNumeroImpar + 2;
            }

        }
        scan.close();
    }

}

