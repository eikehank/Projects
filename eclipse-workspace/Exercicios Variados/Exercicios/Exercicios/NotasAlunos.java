package Exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class NotasAlunos {

	public static void main(String[] args) {
		// Variaveis
		String Aluno, Professor;
		double n1, n2, n3, media = 0;
		Scanner teclado = new Scanner(System.in);

		// Entrada do usuario
		JOptionPane.showMessageDialog(null, "Olá seja bem vindo");
		System.out.println("Informe o nome do professor: ");
		Professor = teclado.next();
		System.out.println("Informe o nome do aluno: ");
		Aluno = teclado.next();
		System.out.println("Informe a nota do aluno 1: ");
		n1 = teclado.nextDouble();
		System.out.println("Informe a nota do aluno 2: ");
		n2 = teclado.nextDouble();
		System.out.println("Informe a nota  do aluno 3: ");
		n3 = teclado.nextDouble();

		// Processamento / Exibição
		media = media2(n1, n2, n3);
		resultado(media);
		System.out.println("Aluno : " + Aluno);
		System.out.println("Professor : " + Professor);
		System.out.println("Sua média é: " + media);
		System.out.println(conceito(media));

	}

		// Metodos
	public static double media2(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;

	}

	public static void resultado(double media) {

		if (media >= 6.0) {
			System.out.println("Aluno aprovado!");

		} else {
			System.out.println("Aluno reprovado!");

		}
	}

	public static String conceito(double media) {

		if (media >= 9) {
			return ("Aluno nota A");
		} else if (media >= 7.5 && media < 9) {
			return ("Aluno nota B");
		} else if (media >= 6 && media < 7.5) {
			return ("Aluno nota C");
		} else if (media < 6) {
			return ("Aluno nota D");

		}
		return null;
	}
}