package SolucionandoDesafiosEmJava;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();

        System.out.printf("DIFERENCA = %d", (a * b - c * d));

        leitor.close();

    }

}
