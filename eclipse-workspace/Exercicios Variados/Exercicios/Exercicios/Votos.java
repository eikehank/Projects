package Exercicios;

import javax.swing.JOptionPane;

public class Votos {

	public static void main(String[] args) {

		String op = "";
		int votoBrancos = 0, votosNulos = 0, votosValidos = 0, votoTotal = 0;

		JOptionPane.showMessageDialog(null, "Votos válidos são considerados apenas números.", "Instruções",
				JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Caso queira votar branco escreva b", "Instruções",
				JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Caso queira votar nulo escreva n", "Instruções",
				JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Quando finalizado escreva Fim.", "Instruções",
				JOptionPane.WARNING_MESSAGE);
		do {
			try {
				String votos = JOptionPane.showInputDialog(null, "Escreva seu voto");

				if (votos.equals("b")) {
					votoBrancos++;
					votoTotal++;
					JOptionPane.showMessageDialog(null, "Seu voto foi branco");
				}
				if (votos.equals("n")) {
					votosNulos++;
					votoTotal++;
					JOptionPane.showMessageDialog(null, "Seu voto foi nulo");
				}
				if (votos.matches("[0-9]+")) {
					votoTotal++;
					votosValidos++;
					JOptionPane.showMessageDialog(null, "Seu voto foi validado");
				}
				if (votos.equals("Fim")) {
					op = "Fim";
				}
			} catch (NullPointerException e) {
				System.exit(0);
			}
		} while (op != "Fim");

		JOptionPane.showMessageDialog(null, "Total de votos: " + votoTotal + " \n  Votos Validos: " + votosValidos
				+ " \n Votos Nulos: " + votosNulos + " \n Votos Brancos: " + votoBrancos);
	}
}
