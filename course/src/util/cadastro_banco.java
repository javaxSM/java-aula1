package util;

public class cadastro_banco {
	
	private int number;
	private String holder;
	private double balance;
	public double valorDeposito;
	
	public cadastro_banco(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}


	public cadastro_banco(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public cadastro_banco(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}


	public int getNumber() {
		return number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}	


	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Numero conta: "
				+ number
				+ ", Nome: "
				+ holder
				+ ", Saldo Atual: R$ "
				+ String.format("%.2f", balance);
	}
}
