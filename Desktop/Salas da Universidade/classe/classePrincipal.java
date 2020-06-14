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
				"Ol� seja bem vindo a Unisosiesc.\nMeu nome � PeeP-Bot, irei te ajudar a conhecer melhor o lugar!\n\n"
				+ "Existem v�rios tipo de salas na universidade entre elas"
				+ " est�o as \nsalas de aulas, os laborat�rios, escrit�rios e a sala de confer�ncia.\n\nPara saber mais sobre elas escolha a op��o abaixo!");
		do {		
		System.out.println(
						"(1)Salas de aulas"
						+ "\n(2)Laborat�rios"
						+ "\n(3)Escrit�rios"
						+ "\n(4)Salas de confer�ncias"
						+ "\n(5)Sair");		
		     op = teclado.nextInt();
		
			
		switch (op) {
		case 1:	
			System.out.println(
					"-------------------------------------------------------"
					+ "\n" + "Existem v�rios tipos de salas de aula\n"
					+ "que s�o equipadas para melhor atender as necessidades do professor\n" 
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
					+ "\n" + "\nSalas de videoconfer�ncia:\n" 
					+ "\n" + salaVideoconferencia.capacidade()
					+ "\n" + salaVideoconferencia.camera() 	
					+ "\n" + salaVideoconferencia.net()
					+ "\n" + "\n(1)Voltar (2)Sair");			
			op = teclado.nextInt();	
			break;
		case 2:	
			System.out.println(
					"-------------------------------------------------------"
					+ "\n" + "\nExistem v�rios tipo de laborat�rios" 
					+ "\n" + "\nLaborat�rios de quimica:"
					+ "\n" + quimica.capacidade()
					+ "\n" + quimica.equipamentos()
					+ "\n" + quimica.tabela() 
					+ "\n" + quimica.projetor()
					+ "\n" + "\nLaborat�rios de fisica:"
					+ "\n" + fisica.capacidade()
					+ "\n" + fisica.equipamentos()
					+ "\n" + fisica.projetor()
					+ "\n" + "\nLaborat�rios de computa��o:"
					+ "\n" + computacao.capacidade()
					+ "\n" + computacao.equipamentos() 
					+ "\n" + computacao.projetor()
					+ "\n" + computacao.net() 
					+ "\n" + "\nLaborat�rios de biologia:"
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
					"Como assim j� vai????? Voc� nem conheceu nada!!\n"
					+ "Bom at� a proxima ent�o PeeP-Bot se despedindo =(");
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