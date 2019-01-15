package course;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Produto;

public class Program_estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Para o construtor, criar variaveis "Temporarias".
		
		char resposta;
		do {
			
		
		System.out.println("Entre com seu produto: ");
		System.out.println("Nome Produto: ");
		String name = sc.next(); 
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		//System.out.println("Quantidade: ");
		//int quantidade = sc.nextInt();
		
		
		Produto produto = new Produto(name, preco); // Chamada do CONSTRUTOR apenas para 2 parametros.
		
		
		System.out.println(); // Pula linha
		System.out.println("Produto: " + produto.toString());
		
		System.out.println();
		System.out.println("ADD quantos produtos?: ");
		int quantidade = sc.nextInt();
		produto.adicionaProduto(quantidade);
		
		System.out.println(); 
		System.out.println("Produto atualizado: " + produto.toString());
		
		System.out.println();
		System.out.println("Remover quantos produtos?: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println();
		System.out.println("Produto atualizado: " + produto.toString());
		
		System.out.println();
		
		System.out.println("Deseja refazer? [S/N]: ");
		resposta = sc.next().charAt(0);
		
		} while(resposta != 'n');
		sc.close();

	}

}
