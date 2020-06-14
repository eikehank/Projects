package Exercicios;

import java.util.Scanner;

public class ListagemParImpar {

	public static void main(String[] args) {

		int n1, n2, contadorImpar = 0, contadorPar = 0, passou = 1;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Informe o menor número primeiro: ");
			n1 = teclado.nextInt();
			System.out.println("Informe o maior número: ");
			n2 = teclado.nextInt();

			if (n1 > n2) {

				System.out.println("Escreva o menor número primeiro!! \n");

			} else {
				passou = 0;
			}

		} while (passou != 0);

		System.out.println("Listagem de números impares: ");
		for (int contador = n1; contador <= n2; contador++) {

			if (contador % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
				System.out.println(contador);
			}
		}
		System.out.println("Listagem de números pares: ");
		for (int contador = n1; contador <= n2; contador++) {

			if (contador % 2 == 0) {
				System.out.println(contador);
			}
		}
		System.out.println("Números impares: " + contadorImpar);
		System.out.println("Números pares: " + contadorPar);
	}
}