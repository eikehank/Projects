package Exercicios;

import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {

	int base = 0, expoente, resultado = 0;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe a base: ");
	base = teclado.nextInt();
	System.out.println("Informe o expoente: ");
	expoente = teclado.nextInt();
	resultado = base;
	
	for (int contador = 1; contador < expoente; contador++) {
		resultado = resultado * base;
		
		
	}
	System.out.println("Este é o resultado: " + resultado);	
	}
}

