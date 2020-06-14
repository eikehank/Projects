package classe;

import java.util.Scanner;

import conferencia.conferenciaNormal;
import escritorio.saladeGuerra;
import laboratorios.biologia;
import laboratorios.computacao;
import laboratorios.fisica;
import laboratorios.quimica;
import salaAula.salaInteligente;
import salaAula.salaNormal;
import salaAula.salaVideoconferencia;

public class classePrincipal {

	public static void main(String[] args) {

	
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		
		System.out.println(
				"Olá seja bem vindo a Unisosiesc.\nMeu nome é PeeP-Bot, irei te ajudar a conhecer melhor o lugar!\n\n"
				+ "Existem vários tipo de salas na universidade entre elas"
				+ " estão as \nsalas de aulas, os laboratórios, escritórios e a sala de conferência.\n\nPara saber mais sobre elas escolha a opção abaixo!");
		do {		
		System.out.println(
						"(1)Salas de aulas"
						+ "\n(2)Laboratórios"
						+ "\n(3)Escritórios"
						+ "\n(4)Salas de conferências"
						+ "\n(5)Sair");		
		     op = teclado.nextInt();
		
			
		switch (op) {
		case 1:	
			System.out.println(
					"-------------------------------------------------------"
					+ "\n" + "Existem vários tipos de salas de aula\n"
					+ "que são equipadas para melhor atender as necessidades do professor\n" 
					+ "\n" + "Salas de aulas normais:\n"
					+ "\n" + salaNormal.capacidade()
					+ "\n" + salaNormal.assentos()
					+ "\n" + salaNormal.mesa() 
					+ "\n" + salaNormal.quadro()
					+ "\n" + "\nSalas inteligentes:"
					+ "\n" + salaInteligente.capacidade()
					+ "\n" + salaInteligente.projetor() 
					+ "\n" + salaInteligente.tv() 
					+ "\n" + salaInteligente.net()
					+ "\n" + salaInteligente.pc()
					+ "\n" + "\nSalas de videoconferência:\n" 
					+ "\n" + salaVideoconferencia.capacidade()
					+ "\n" + salaVideoconferencia.camera() 	
					+ "\n" + salaVideoconferencia.net()
					+ "\n" + "\n(1)Voltar (2)Sair");			
			op = teclado.nextInt();	
			break;
		case 2:	
			System.out.println(
					"-------------------------------------------------------"
					+ "\n" + "\nExistem vários tipo de laboratórios" 
					+ "\n" + "\nLaboratórios de quimica:"
					+ "\n" + quimica.capacidade()
					+ "\n" + quimica.equipamentos()
					+ "\n" + quimica.tabela() 
					+ "\n" + quimica.projetor()
					+ "\n" + "\nLaboratórios de fisica:"
					+ "\n" + fisica.capacidade()
					+ "\n" + fisica.equipamentos()
					+ "\n" + fisica.projetor()
					+ "\n" + "\nLaboratórios de computação:"
					+ "\n" + computacao.capacidade()
					+ "\n" + computacao.equipamentos() 
					+ "\n" + computacao.projetor()
					+ "\n" + computacao.net() 
					+ "\n" + "\nLaboratórios de biologia:"
					+ "\n" + biologia.capacidade()
					+ "\n" + biologia.equipamentos() 
					+ "\n" + biologia.projetor()					
					+ "\n" + biologia.esqueleto()
					+ "\n" + "\n(1)Voltar (2)Sair");
		    op = teclado.nextInt();	
			break;
		case 3:
			System.out.println(
					"-------------------------------------------------------"
					+ "\n" + saladeGuerra.apelido()
					+ "\n" + saladeGuerra.capacidade() 
					+ "\n" + saladeGuerra.pc() 
					+ "\n" + saladeGuerra.cafe() 
					+ "\n" + saladeGuerra.geladeira()
					+ "\n" + "\n(1)Voltar (2)Sair");
			op = teclado.nextInt();	
			break;		
		case 4:
			System.out.println(
					"-------------------------------------------------------"
					+ "\n" + conferenciaNormal.capacidade() 
					+ "\n" + conferenciaNormal.projetor()
				    + "\n" + conferenciaNormal.pc() 
 				    + "\n" + conferenciaNormal.normal()
				    + "\n" + "\n(1)Voltar (2)Sair");
			op = teclado.nextInt();	
			break;		
		default :
			System.out.println(
					"Como assim já vai????? Você nem conheceu nada!!\n"
					+ "Bom até a proxima então PeeP-Bot se despedindo =(");
			System.exit(0);
			break;
		}		
		}while (op == 1);
		if (op == 2 ) {
			System.out.println(
					"Foi bom ter te conhecido!! Espero te ver logo em nossa universidade!!"
					+ "\nPeeP-Bot se despedindo ;D");
		}
	}
}