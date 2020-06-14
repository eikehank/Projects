package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

//		8 - Fa�a um programa para receber as temperaturas durante uma semana. Ao final apresente:
//		Maior temperatura e o dia;
//		Menor temperatura e o dia;
//		M�dia de temperatura;
//		Dias da semana abaixo da m�dia.

			// Vetores
		int[] temperatura = new int[7];
		String[] dias = {"Domingo", "Segunda", "Ter�a", "Quarta", "Quinta", "Sexta", "Sabado"};
		DecimalFormat duasCasas = new DecimalFormat("0.0");
		
			// V�riaveis (resultado)
		Scanner teclado = new Scanner(System.in);
		double media = 0;
		int menorTemperatura = Integer.MAX_VALUE, maiorTemperatura = 0;
		String frio = "", quente = "";
		
			// Processamento / Entrada
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Informe a temperatura " + dias[i] + ": ");
			temperatura[i] = teclado.nextInt();
			media = temperatura[i] + media;

			// Compara��o
			if (temperatura[i] > maiorTemperatura) {			
				quente = dias[i];
				maiorTemperatura = temperatura[i];
							
			} else if (temperatura[i] < menorTemperatura) {
				frio = dias[i];
				menorTemperatura = temperatura[i];				
			}
		}
			// Saida
		System.out.println(
				"A maior temperatura da semana: " + quente + ": " + maiorTemperatura + "\n" + 
				"A menor temperatura da semana: " + frio + ": " +  menorTemperatura + "\n" +
 				"A m�dia de temperatura da semana foi: " + duasCasas.format(media / temperatura.length));	
	}
}
