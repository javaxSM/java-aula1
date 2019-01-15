package util;

public class funcionarios_auto1 {
	
	
	private int id;
	private String nome;
	private double salario;
	
	
	public funcionarios_auto1(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}



	public double getSalario() {
		return salario ;
	}



	
	public void Porcentagem(double porcentagem) {
		 salario += (salario * porcentagem) / 100 ;
	}
	
	
	public String toString() {
		return "ID: "
			   + id
			   + "\nNome: "
			   + nome
			   + "\nSalario: "
			   + String.format("%.2f", salario);
	}

}
