package Exercicios;

import java.util.Scanner;

public class VerificacaoNumeros {

	public static void main(String[] args) {
		

		double n2 = 0;
		double n1 = 0;
		int n15 = 0, nn0 = 0, npar = 0, npp = 0, ni = 0, nin = 0, np0 = 0;
		Scanner teclado = new Scanner(System.in);

		while (n2 < 15) {
			System.out.println("Informe um numero:");
			n1 = teclado.nextInt();
			if (n1 > 15) {
				n15++;
			}
			if (n1 < 0) {
				nn0++;
			}
			if (n1 % 2 == 0) {
				npar++;
			}
			if (n1 % 2 == 0 && n1 > 0) {
				npp++;
			}
			if (n1 % 2 > 0) {
				ni++;
			}
			if (n1 % 2 > 0 && n1 < 0) {
				nin++;
			}
			if (n1 == 0) {
				np0++;
			}
			n2++;
		}
		System.out.println("Superiores a 15: " + n15);
		System.out.println("Inferiores a 0: " + nn0);
		System.out.println("Numeros pares: " + npar);
		System.out.println("Numeros positivos e pares: " + npp);
		System.out.println("Numeros Impares: " + ni);
		System.out.println("Numeros impares e negativos: " + nin);
		System.out.println("Numeros com valor = 0: " + np0);
	}
}
