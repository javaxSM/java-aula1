package Entidade;

public class Produto {

	public String name;
	public double preco;
	public int quantidade;	
	
	public Produto() { // Construtor PADRÃO 
		
	}
	
	public Produto(String name, double preco, int quantidade) { // CONSTRUTOR - PARA OBRIGAR O USUÁRIO A DIGITAR ALGO != DE VAZIO
		this.name = name;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	public Produto(String name, double preco) {
		this.name = name;
		this.preco = preco;
	}
	
	public double totalEstoque() {
		return preco * quantidade;
	}
	
	 public  void adicionaProduto(int quantidade) {
		this.quantidade += quantidade; // this= Pega o atribudo da classe em especifico
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: R$ "
			+ String.format("%.2f", totalEstoque());
	}
	
}
