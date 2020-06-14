package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificacaoLogin {

	public static void main(String[] args) {
		// Variaveis
		Scanner teclado = new Scanner(System.in);
		String codigo;
		int senha = -1;

		// Entrada
		System.out.println("Usuário:");
		codigo = teclado.next();

		/*
		 * Verificação de erro (caso o usuario escreva uma senha invalida, ira repetir o
		 * processo ate uma senha valida for digitada)
		 */

		do {
			try {
				// Entrada
				System.out.println("Senha:");
				senha = teclado.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Informe uma senha valida! \n");
				teclado.next();
			}
		} while (senha == -1);

		// Processo
		conta(senha, codigo);
	}

	// Metodo
	public static void conta(int senha, String codigo) {

		if (codigo.equals("1111") && senha == 2222) {
			System.out.println("Acesso Permitido.");
		} else {
			System.out.println("Acesso Negado");
		}
	}

}
