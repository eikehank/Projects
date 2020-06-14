package classePrincipal;

import java.util.Random;
import java.util.Scanner;
import GNC.cinema;
import cinemas.cinema1;
import cinemas.cinema2;
import cinemas.cinema3;
import cinemas.cinema4;
import cinemas.cinema5;
import filmes.atributosFilmes;
import filmes.filme1;
import filmes.filme2;
import filmes.filme3;
import filmes.filme4;
import filmes.filme5;

public class classeMain {

	public static void main(String[] args) {

		cinema endereço = new cinema();
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		int gerador1 = gerador.nextInt(5) + 1;
		int gerador2 = gerador.nextInt(3) + 1;
		atributosFilmes dadosFilme = new atributosFilmes();
		
		System.out.println(
				"Bem vindo ao localizador de cinemas GNC!\n"
				+ "\nA baixo serão pedidos dados do locas que você\n"
				+ "gostaria de saber se existe um cinema proximo da sua região\n");	
		System.out.println("Rua desejada: ");
		endereço.setRua(teclado.nextLine());		
		System.out.println("Bairro: ");
		endereço.setBairro(teclado.nextLine());
		System.out.println("Agora queremos saber algumas informações sobre o filme\n");
		System.out.println("Tipo de exibição: ");
		dadosFilme.setExibicao(teclado.nextLine());
		System.out.println("Genero do filme: ");
		dadosFilme.setGenero(teclado.nextLine());
		
		switch (gerador1) {
		case 1:
				System.out.println(
					"\nRua: "
					+ "\n" + cinema1.getRua()
					+ "\n" + "Bairro: "
					+ "\n" + cinema1.getBairro()
					+ "\n" + cinema1.numero()
					+ "\n" +"Cinema: "
					+ "\n" + cinema1.nome()
					+ "\n" + cinema1.lotacao()
					+ "\n" + cinema1.salasdisponiveis()
					+ "\n" + cinema1.totalsalas()
					+ "\n" + cinema1.telefone()
					+ "\n" + cinema1.saida()
					+ "\n" + "\n-----------------------------------");	
			switch (gerador2) {
			case 1:
			System.out.println("Filmes em cartaz:\n");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 
				
					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao());
				break;
			case 2:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme3.nome()
					+ "\n" + filme3.nomebr()
					+ "\n" + filme3.idade()
					+ "\n" + filme3.diretor()
					+ "\n" + filme3.atores()
					+ "\n" + filme3.ano()
					+ "\n" + "Genero do filme: "
					+ filme3.getGenero()
					+ "\n" + "Exibição: "
					+ filme3.getExibicao() 
				
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			case 3:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 

					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			}			
			break;
		case 2:
			System.out.println(
					"\nRua: "
					+ cinema2.getRua() + "\n"
					+ "Bairro: "
					+ cinema2.getBairro() + "\n"
					+ cinema2.numero() + "\n"
					+ "Cinema: "
					+ cinema2.nome() + "\n"
					+ cinema2.lotacao() + "\n"
					+ cinema2.salasdisponiveis() + "\n"
					+ cinema2.totalsalas() + "\n"
					+ cinema2.telefone() + "\n"
					+ cinema2.saida() + "\n"
					+ "-----------------------------------");
			switch (gerador2) {
			case 1:
			System.out.println("Filmes em cartaz:\n");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 
					
					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao());
				break;
			case 2:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme3.nome()
					+ "\n" + filme3.nomebr()
					+ "\n" + filme3.idade()
					+ "\n" + filme3.diretor()
					+ "\n" + filme3.atores()
					+ "\n" + filme3.ano()
					+ "\n" + "Genero do filme: "
					+ filme3.getGenero()
					+ "\n" + "Exibição: "
					+ filme3.getExibicao() 
			
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			case 3:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 
				
					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			}	
			break;
		case 3:
			System.out.println(
					"\nRua: "
					+ cinema3.getRua() + "\n"
					+ "Bairro: "
					+ cinema3.getBairro() + "\n"
					+ cinema3.numero() + "\n"
					+ "Cinema: "
					+ cinema3.nome() + "\n"
					+ cinema3.lotacao() + "\n"
					+ cinema3.salasdisponiveis() + "\n"
					+ cinema3.totalsalas() + "\n"
					+ cinema3.telefone() + "\n"
					+ cinema3.saida() + "\n"
					+ "-----------------------------------");
			switch (gerador2) {
			case 1:
			System.out.println("Filmes em cartaz:\n");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 
				
					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao());
				break;
			case 2:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme3.nome()
					+ "\n" + filme3.nomebr()
					+ "\n" + filme3.idade()
					+ "\n" + filme3.diretor()
					+ "\n" + filme3.atores()
					+ "\n" + filme3.ano()
					+ "\n" + "Genero do filme: "
					+ filme3.getGenero()
					+ "\n" + "Exibição: "
					+ filme3.getExibicao() 
				
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			case 3:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 
				
					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			}	
			break;
		case 4:
			System.out.println(
					"\nRua: "
					+ cinema4.getRua() + "\n"
					+ "Bairro: "
					+ cinema4.getBairro() + "\n"
					+ cinema4.numero() + "\n"
					+ "Cinema: "
					+ cinema4.nome() + "\n"
					+ cinema4.lotacao() + "\n"
					+ cinema4.salasdisponiveis() + "\n"
					+ cinema4.totalsalas() + "\n"
				    + cinema4.telefone() + "\n"
					+ cinema4.saida() + "\n"
				    + "-----------------------------------");
			switch (gerador2) {
			case 1:
			System.out.println("Filmes em cartaz:\n");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 
					
					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
					
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao());
				break;
			case 2:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme3.nome()
					+ "\n" + filme3.nomebr()
					+ "\n" + filme3.idade()
					+ "\n" + filme3.diretor()
					+ "\n" + filme3.atores()
					+ "\n" + filme3.ano()
					+ "\n" + "Genero do filme: "
					+ filme3.getGenero()
					+ "\n" + "Exibição: "
					+ filme3.getExibicao() 
					
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			case 3:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 
				
					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
					
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
					
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			}	
			break;
		case 5:
			System.out.println(
					"\nRua: "
					+ cinema5.getRua() + "\n"
					+ "Bairro: "
					+ cinema5.getBairro() + "\n"
					+ cinema5.numero() + "\n"
					+ "Cinema: "
					+ cinema5.nome() + "\n"
					+ cinema5.lotacao() + "\n"
					+ cinema5.salasdisponiveis() + "\n"
					+ cinema5.totalsalas() + "\n"
					+ cinema5.telefone() + "\n"
					+ cinema5.saida() + "\n"
					+ "-----------------------------------");
			switch (gerador2) {
			case 1:
			System.out.println("Filmes em cartaz:\n");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 
					
					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
					
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao());
				break;
			case 2:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme3.nome()
					+ "\n" + filme3.nomebr()
					+ "\n" + filme3.idade()
					+ "\n" + filme3.diretor()
					+ "\n" + filme3.atores()
					+ "\n" + filme3.ano()
					+ "\n" + "Genero do filme: "
					+ filme3.getGenero()
					+ "\n" + "Exibição: "
					+ filme3.getExibicao() 
					
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			case 3:
			System.out.println("Filmes em cartaz: ");
			System.out.println(
					filme1.nome()
					+ "\n" + filme1.nomebr()
					+ "\n" + filme1.idade()
					+ "\n" + filme1.diretor()
					+ "\n" + filme1.atores()
					+ "\n" + filme1.ano()
					+ "\n" + "Genero do filme: "
					+ filme1.getGenero()
					+ "\n" + "Exibição: "
					+ filme1.getExibicao() 
				
					+ "\n-----------------------" 
					+ "\n" + filme2.nome()
					+ "\n" + filme2.nomebr()
					+ "\n" + filme2.idade()
					+ "\n" + filme2.diretor()
					+ "\n" + filme2.atores()
					+ "\n" + filme2.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme5.nome()
					+ "\n" + filme5.nomebr()
					+ "\n" + filme5.idade()
					+ "\n" + filme5.diretor()
					+ "\n" + filme5.atores()
					+ "\n" + filme5.ano()
					+ "\n" + "Genero do filme: "
					+ filme2.getGenero()
					+ "\n" + "Exibição: "
					+ filme2.getExibicao()
				
					+ "\n-----------------------" 
					+ "\n" + filme4.nome()
					+ "\n" + filme4.nomebr()
					+ "\n" + filme4.idade()
					+ "\n" + filme4.diretor()
					+ "\n" + filme4.atores()
					+ "\n" + filme4.ano()
					+ "\n" + "Genero do filme: "
					+ filme4.getGenero()
					+ "\n" + "Exibição: "
					+ filme4.getExibicao());
				break;
			}	
			
			break;
		}
	}
}
