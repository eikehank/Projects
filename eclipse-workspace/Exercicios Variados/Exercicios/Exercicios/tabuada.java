package Exercicios;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		int valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tabuada!!!");
		System.out.println("Digite um numero: ");
		valor = teclado.nextInt();	
		
		for (int contador = 1; contador <= 10; contador++) {
		System.out.println(valor + "x" + contador + " = " + (contador * valor));	
				
		}
		System.out.println("\nTabuada do: " + valor);
	}

}
