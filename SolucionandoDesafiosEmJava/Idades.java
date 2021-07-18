package SolucionandoDesafiosEmJava;

import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        int quantidadeDeIdades = 0;
        double somaIdades = 0.0;

        while (idade >= 1) {

            somaIdades += idade;
            quantidadeDeIdades++;

            idade = leitor.nextInt();

        }
        try {

            double mediaIdade = somaIdades / quantidadeDeIdades;
            System.out.printf("%.2f", mediaIdade);

        } catch (ArithmeticException e) {
            System.out.println(" Divisao por zero impossivel ");
            
        }

        leitor.close();
    }

}
