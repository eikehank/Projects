package Exercicios;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
//		7 – Faça um algoritmo que leia os seguintes dados de 10 alunos. 
//		Dados que deverão serem lidos: Nome, Idade, Peso e Altura. 
//		Calcule o IMC (Índice de massa corporal) de cada aluno 
//		Ao final exiba as seguintes informações:
//		Aluno mais baixo
//		Aluno mais alto
//		Aluno com maior peso
//		Aluno com menor peso
//		Quantidade de Alunos em cada uma das faixas do IMC (Magreza, Normal, Sobrepeso, Obesidade, Obesidade Grave)

		// Declarando os Vetores	
		String[] nome = new String[10];
		long[] peso = new long[10];
		int[] idade = new int[10];
		long[] altura = new long[10];
		long[] imc = new long[10];
		
		// Variaveis destaque (resposta)
		Scanner teclado = new Scanner(System.in);
		String nomePesado = "", nomeLeve = "", nomeBaixo = "", nomeAlto = "";
		double maiorPeso = 0, menorPeso = Double.MAX_VALUE, maiorAltura = 0, menorAltura = Double.MAX_VALUE;
		
		// Contadores de Alunos na Categorias IMC
		int magreza = 0; // < 20
		int normal = 0; // >= 20 e < 25
		int sobrePeso = 0; // >= 25 e < 30
		int obesidade = 0; // >= 30 e < 35
		int obesidadeGrave = 0; // >= 35

		// For de atribuição
		for (int i = 0; i < 1; i++) {
			System.out.println("Informe seu nome: ");
			nome[i] = teclado.next();
			System.out.println("Informe seu peso: ");
			peso[i] = teclado.nextLong();
			System.out.println("Informe sua idade: ");
			idade[i] = teclado.nextInt();
			System.out.println("Informe sua altura: ");
			altura[i] = teclado.nextLong();

			// Cálculos dentro do for, por pessoa
	       
			// Mais baixo e alto
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
				nomeAlto = nome[i];
			} else if (altura[i] < menorAltura) {
				menorAltura = altura[i];
				nomeBaixo = nome[i];
			}
			
			// Mais pesado e leve
			if (peso[i] > maiorPeso) {
				maiorPeso = peso[i];
				nomePesado = nome[i];
			} else if (peso[i] < menorPeso) {
				menorPeso = peso[i];
				nomeLeve = nome[i];
			}
			
			// Calculo IMC
			imc[i] = peso[i] / (altura[i] * altura[i]);
			
			// Categorias IMC
			if (imc[i] < 20) {
				magreza++;
			} else if ((imc[i] >= 20) && (imc[i] < 25)) {
				normal++;
			} else if ((imc[i] >= 25) && (imc[i] < 30)) {
				sobrePeso++;
			} else if ((imc[i] >= 30) && (imc[i] < 35)) {
				obesidade++;
			} else {
				obesidadeGrave++;
			}
		}
		// Saida
		System.out.println(
		            "Aluno mais alto é o(a) " + nomeAlto + " com " + maiorAltura + "m" +
		            "\nAluno mais baixo é o(a) " + nomeBaixo  + " com " + menorAltura + "m" +
		            "\nAluno mais pesado é o(a) " + nomePesado + " com " + maiorPeso + "kg" +
		            "\nAluno mais leve é o(a) " + nomeLeve + " com " + menorPeso + "kg" +
		            "\n\nIMC Magreza: " + magreza + " aluno(s)" +
		            "\nIMC Normal: " + normal + " aluno(s)" +
		            "\nIMC Sobrepeso: " + sobrePeso + " aluno(s)" +
		            "\nIMC Obesidade: " + obesidade + " aluno(s)" +
		            "\nIMC Obesidade Grave: " + obesidadeGrave + " aluno(s)");
	}
}
