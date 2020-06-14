package Exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenacaoVetor {

	public static void main(String[] args) {

//		 10 – Faça um algoritmo que receba 10 números e imprima todos
//		 os valores em ordem crescente e decrescente.

		// Variaveis
		int[] vetor = new int[10];
		int[] vetorCrescente = new int[10];
		int[] vetorDecrescente = new int[10];
		Scanner teclado = new Scanner(System.in);
		int numeros = 0;

		// Entrada
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor para a posição " + i + " de vetor"));
			vetorCrescente[i] = vetor[i];
			vetorDecrescente[i] = vetor[i];
		}
		// Crescente
		for (int j = 0; j < vetor.length; j++) {
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetorCrescente[i] > vetorCrescente[i + 1]) {
					numeros = vetorCrescente[i];
					vetorCrescente[i] = vetorCrescente[i + 1];
					vetorCrescente[i + 1] = numeros;
				}
			}
		}
	
		// Decrescente
		for (int j = 0; j < vetor.length; j++) {
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetorDecrescente[i] < vetorDecrescente[i + 1]) {
					numeros = vetorDecrescente[i];
					vetorDecrescente[i] = vetorDecrescente[i + 1];
					vetorDecrescente[i + 1] = numeros;
				}
			}
		}
	
		// Saida
		System.out.print("Ordem crescente: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetorCrescente[i] + ", ");
		}
		System.out.print("\nOrdem decrescente: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetorDecrescente[i] + ", ");
		}
	}
}