package DesafiosMatematicosEmjava;

import java.io.IOException; // OK
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int valores[] = new int[5];
        int valoresPares = 0;
        int valoresImpares = 0;
        int valoresPositivos = 0;
        int valoresNegativos = 0;

        for (int i = 0; i < valores.length; i++) {
            valores[i] = leitor.nextInt();

            if (valores[i] >= 1) {
                valoresPositivos++;
            }

            if (valores[i] < 0) {
                valoresNegativos++;

            }

            if (valores[i] % 2 == 0) {
                valoresPares++;

            } else if (valores[i] % 2 != 0) {
                valoresImpares++;

            }

        }

        System.out.println("\n"+valoresPares + " valor(es) par(es)");
        System.out.println(valoresImpares + " valor(es) impar(es)");
        System.out.println(valoresPositivos + " valor(es) positivo(s)");
        System.out.println(valoresNegativos + " valor(es) negativo(s)");

        leitor.close();
    }

}



