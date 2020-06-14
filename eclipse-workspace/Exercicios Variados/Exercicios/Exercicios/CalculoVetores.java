package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoVetores {

	public static void main(String[] args) {

		// - Fa�a um algoritmo que recebe 2 vetores de 5 n�meros cada. Ao final receba
		// uma das opera��es b�sicas (+, -, *, /)
		// e apresente um terceiro vetor com o resultado da opera��o de cada elemento do
		// primeiro valor pelo segundo valor.

		double[] valor = new double[5];
		double[] valor2 = new double[5];
		double[] resultado = new double[5];

		int operador = 1;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		// Entrada vetor 1
		for (int i = 0; i < valor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "� numero do vetor 1 ");
			valor[i] = teclado.nextInt();
		} 
		// Entrada vetor 2
			for (int i = 0; i < valor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "� numero do vetor 2 ");
			valor2[i] = teclado.nextInt();
		}
			// Escolha da opera��o
			System.out.println("Escolha a opera��o 1 = + ou 2 = - ou 3 = * ou 4 = /: ");
			operador = teclado.nextInt();

			// Calculos
			for (int i = 0; i < valor.length; i++) {			
			switch (operador) {
			case 1:
				resultado[i] = valor[i] + valor2[i];
				break;
			case 2:
				resultado[i] = valor[i] - valor2[i];
				break;
			case 3:
				resultado[i] = valor[i] * valor2[i];
				break;
			case 4:
				resultado[i] = valor[i] / valor2[i];
				break;
			default:
				System.out.println("C�digo invalido!");
			}
		 // Saida	
			System.out.println("O resultado �: " + df.format(resultado[i]));
			}
	}

}
