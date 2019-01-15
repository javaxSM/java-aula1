package util;

public class aluguel_quartos {
	private String name;
	private String email;
	private int n_quarto;
	
	
	public aluguel_quartos(String name, String email,int n_quarto) {
		this.name = name;
		this.email = email;
		this.n_quarto = n_quarto;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	public void setN_quarto(int n_quarto) {
		this.n_quarto = n_quarto;
	}

	public int getN_quarto() {
		return n_quarto;
	}

	
	
	
	}


