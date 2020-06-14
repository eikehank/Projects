package Exercicios;
import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		

		int n1, n2, n3;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o primeiro número");
		n1 = teclado.nextInt();
		System.out.println("Informe o segundo número");
		n2 = teclado.nextInt();
		System.out.println("Informe o terceiro número");
		n3 = teclado.nextInt();

		// Comparação

		for (int i = 0; i < 3; i++)
			if (n1 < n2 && n1 < n3) {
				System.out.println(n1);
				n1 = Integer.MAX_VALUE;
			} else if (n2 < n1 && n2 < n3) {

				System.out.println(n2);
				n2 = Integer.MAX_VALUE;
			} else if (n3 < n1 && n3 < n2) {

				System.out.println(n3);
				n3 = Integer.MAX_VALUE;
			}
		
	}

}
