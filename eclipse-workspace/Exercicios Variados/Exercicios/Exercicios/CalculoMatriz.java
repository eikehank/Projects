package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoMatriz {

	public static void main(String[] args) {

		double valor1[][] = new double[2][2];
		double valor2[][] = new double[2][2];
		double resultado[][] = new double[2][2];

		DecimalFormat df = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		int operador = 1;
		
		for (int i = 0; i < valor1.length; i++) {
			for (int j = 0; j < valor1[i].length; j++) {
				System.out.println("Informe o " + (i + 1) + " valor da posição da matriz 1: " + "[" + i + "]" + " x " + "[" + j +"]");
				valor1[i][j] = teclado.nextDouble();
			}
		}
		for (int i = 0; i < valor2.length; i++) {
			for (int j = 0; j < valor2[i].length; j++) {
				System.out.println("Informe o " + (i + 1) + " valor da posição da matriz 2: " + "[" + i + "]" + " x " + "[" + j +"]");
				valor2[i][j] = teclado.nextDouble();
			}
		}
		// Escolha da operação
		System.out.println("Escolha a operação 1 = + ou 2 = - ou 3 = * ou 4 = /: ");
		operador = teclado.nextInt();

		for (int i = 0; i < valor2.length; i++) {
			for (int j = 0; j < valor2.length; j++) {			
				switch (operador) {
				case 1:
				resultado[i][j] = valor1[i][j] + valor2[i][j];
				break;
				case 2:
				resultado[i][j] = valor1[i][j] - valor2[i][j];
				break;
				case 3:
				resultado[i][j] = valor1[i][j] * valor2[i][j];
				break;
				case 4:
				resultado[i][j] = valor1[i][j] / valor2[i][j];
				break;
				default:
					System.out.println("Código invalido!");	
				}
				// Saida
				System.out.println("O resultado é: " + df.format(resultado[i][j]));
			}
		}

	}
}
