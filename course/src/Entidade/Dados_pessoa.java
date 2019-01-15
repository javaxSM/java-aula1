package Entidade;



public class Dados_pessoa {
	
	public String nome,nome_item;
	public int idade;
	public double estoque;
	public int quantidade;
	public double preco;
	public char sexo;
	
	
	public double totalEstoque(){
		return preco * quantidade;
		
	}
	 
	public void addproduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "\nComprador : "
			 + nome
			 + "\nIdade: "
			 + idade
			 + "\nNome Produto: "
			 + nome_item
			 + "\nPreço:  "
			 + String.format("%.2f", this.preco)
			 + "\nQuantidade: "
			 + quantidade
			 + "\nTotal:  "
			 + String.format("%.2f", totalEstoque());
	}

}

