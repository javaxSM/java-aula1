package course;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Dados_pessoa;

public class Program_teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dados_pessoa pessoa = new Dados_pessoa();
		
		System.out.println("Digite seu nome: ");
		pessoa.nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		pessoa.idade = sc.nextInt();
		System.out.println("Digite seu sexo: ");
		pessoa.sexo = sc.next().charAt(0);
		
		
		System.out.println();
		
		
		System.out.println("----------Entre com seu produto---------- ");
		System.out.println("Item: ");
		pessoa.nome_item = sc.next();
		System.out.println("preço: ");
		pessoa.preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		pessoa.quantidade = sc.nextInt();
		
		System.out.println(pessoa.toString());
		
		
		
		System.out.println();
		
		System.out.println("Deseja ADD mais deste produto?: ");
		int quantidade = sc.nextInt();
		pessoa.addproduto(quantidade);
		System.out.println("Total atualizado: " + pessoa.toString());
		
		System.out.println();
		
		System.out.println("Deseja remover quantos desse produto?: ");
		quantidade = sc.nextInt();
		pessoa.removeProduto(quantidade);
		
		
		System.out.println("Total atualizado depois de removido: " + pessoa.toString());
		
		sc.close();

	}

}
