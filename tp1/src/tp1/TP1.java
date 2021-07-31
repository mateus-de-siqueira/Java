/*
 * 
 * Nome: Mateus de Siqueira Silva
 * Matrícula: 200024787
 *
 *
*/

package tp1;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TP1 {
	
	// Método para limpeza de tela
	public static void limpaTela() {
		// Intruções
		for(int cont = 1; cont <=25; cont++ ) {
			System.out.println();
		}
	}
	
	public static void criarCliente() {
		// Declarações
		int quant;
		
		System.out.print("Digite a quantidade de clientes que deseja cadastrar: ");
		quant = MeuScanner.getInt();
		
		// Matriz		
		Cliente cli[][] = new Cliente[quant][3];
		
				
		for (int aux=0; aux < quant; aux++) {
			System.out.println("---------------------------------------------------------");
			// Criar um objeto produto por vez
			cli[aux][0] = new Cliente();
			cli[aux][1] = new Cliente();
			cli[aux][2] = new Cliente();

			String auxNome = new String();
			String auxEndereco = new String();
			String auxTelefone = new String();
			
			// Leitura do nome do cliente
			do {
				System.out.print("Digite o nome do cliente: ");
				auxNome = MeuScanner.getString();
				
			} while (auxNome == null);
			cli[aux][0].setNomeCliente(auxNome);
			
			// Leitura do endereço
			do {
				System.out.print("Digite o Endereço: ");
				auxEndereco = MeuScanner.getString();
				
			} while (auxEndereco == null);
			cli[aux][1].setEndereco(auxEndereco);
			
			// Leitura do telefone
			do {
				System.out.print("Digite o telefone ");
				auxTelefone = MeuScanner.getString();
				
			} while (auxTelefone == null);
			cli[aux][2].setTelefone(auxTelefone);
		
		}
		
		limpaTela();
		
		for (int aux=0; aux < quant; aux++) {
			System.out.println("---------------------------------------------------------");
			System.out.println("Nome: " + cli[aux][0].getNomeCliente());
			System.out.println("Endereço: " + cli[aux][1].getEndereco());
			System.out.println("Telefone: " + cli[aux][2].getTelefone());
		}
	}
	
	public static void criarProduto() {
		// Declarações
		int quant;
		
		System.out.print("Digite a quantidade de produtos que deseja cadastrar: ");
		quant = MeuScanner.getInt();
		
		// Matriz		
		Produto prod[][] = new Produto[quant][5];
		
				
		for (int aux=0; aux < quant; aux++) {
			System.out.println("---------------------------------------------------------");
			// Criar um objeto produto por vez
			prod[aux][0] = new Produto();
			prod[aux][1] = new Produto();
			prod[aux][2] = new Produto();
			prod[aux][3] = new Produto();
			prod[aux][4] = new Produto();
			String auxNome = new String();
			String auxDescricao = new String();
			double auxPreco;
			double auxLucro;
			int auxQtd;
			// Leitura do nome do produto
			do {
				System.out.print("Digite o nome do produto: ");
				auxNome = MeuScanner.getString();
				
			} while (auxNome == null);
			prod[aux][0].setNomeProduto(auxNome);
			
			// Leitura da Descrição do produto
			do {
				System.out.print("Digite a descrição do produto: ");
				auxDescricao = MeuScanner.getString();
				
			} while (auxDescricao == null);
			prod[aux][1].setDescricao(auxDescricao);
		
			// Leitura do preço do produto
			do {
				System.out.print("Digite o valor do produto: ");
				auxPreco = MeuScanner.getDouble();					
			} while (auxPreco < 0);
			prod[aux][2].setPreco(auxPreco);
			
			// Leitura do lucro do produto
			do {
				System.out.print("Digite o lucro do produto: ");
				auxLucro = MeuScanner.getDouble();					
			} while (auxLucro < 0);
			prod[aux][3].setLucro(auxLucro);
			
			// Leitura da quantidade do produto
			do {
				System.out.print("Digite a quantidade do produto: ");
				auxQtd = MeuScanner.getInt();					
			} while (auxQtd < 0);
			prod[aux][4].setQtd(auxQtd);
		
		}
		
		limpaTela();
		
		for (int aux=0; aux < quant; aux++) {
			System.out.println("---------------------------------------------------------");
			System.out.println("Nome: " + prod[aux][0].getNomeProduto());
			System.out.println("Descrição: " + prod[aux][1].getDescricao());
			System.out.println("Preço: R$" + prod[aux][2].getPreco());
			System.out.println("Lucro: " + prod[aux][3].getLucro());
			System.out.println("qtd: " + prod[aux][4].getQtd());
		}
		

	}
			
	public static void main(String[] args) {	
		
		char opcao; 
		 	
		do {
			System.out.println("Digite [1] para Cadastrar um cliente");
			System.out.println("Digite [2] para Cadastrar um produto");
			System.out.println("Ou digite qualquer outro valor para sair");
			int servico = MeuScanner.getInt();
			switch (servico) {
			case 1: servico = 1;
				criarCliente();
				break;
			case 2: servico = 2;
				criarProduto();
			break;
			}
			
			
			System.out.println("Deseja continuar S/N"); 
			opcao = MeuScanner.getString().charAt(0); 
		} while (opcao == 's' || opcao == 'S');
		System.out.println("\n\nPrograma Encerrado.");
		
	}

}

