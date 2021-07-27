package SolucionandoDesafiosEmJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemRepetidaDeNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidadeDeValores = entrada.nextInt();
		Map<Integer, Integer> conjuntoDeNumeros = new HashMap<>();

		for (int contador = 0; contador < quantidadeDeValores; contador++) {
			int valor = entrada.nextInt();

			if (conjuntoDeNumeros.containsKey(valor)) {
				Integer quantidade = conjuntoDeNumeros.get(valor);
				conjuntoDeNumeros.put(valor, ++quantidade);
			} else {
				conjuntoDeNumeros.put(valor, 1);
			}
		}
		conjuntoDeNumeros.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));

		entrada.close();
	}
}
