package Exercicios;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		// Variaveis
		int n1, n2, n3;
		Scanner teclado = new Scanner(System.in);
		// Entrada
		System.out.println("Informe o primeiro numero: ");
		n1 = teclado.nextInt();
		System.out.println("Informe o segundo numero: ");
		n2 = teclado.nextInt();
		System.out.println("Informe o terceiro numero: ");
		n3 = teclado.nextInt();

		// Processo / Exibiçao	
		System.out.println(maiornumero(n1, n2, n3));
		System.out.println(menornumero(n1, n2, n3));
	}

	// Metodo / Comparação maior numero
	public static String maiornumero(int n1, int n2, int n3) {

		if (n1 > n2 && n1 > n3) {
			return "O maior valor é: " + n1;
		} else if (n2 > n1 && n2 > n3) {
			return "O maior valor é: " + n2;
		} else if (n3 > n1 && n3 > n2) {
			return "O maior valor é: " + n3;
		} else {
			return "Todos os numeros são igualitários";
		}
	}

	// Metodo / Comparação menor numero
	public static String menornumero(int n1, int n2, int n3) {

		if (n1 < n2 && n1 < n3) {
			return "O menor valor é: " + n1;
		} else if (n2 < n1 && n2 < n3) {
			return "O menor valor é: " + n2;
		} else if (n3 < n1 && n3 < n2) {
			return "O maior menor é: " + n3;
		} else {
			return "Todos os numeros são igualitários";
		}
	}
}
