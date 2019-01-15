package course;

import java.util.Locale;
import java.util.Scanner;

import util.aluguel_quartos;

public class aluguel_quarto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quanto pessoas para alugar quarto?");
		int n = sc.nextInt();

		aluguel_quartos[] vect = new aluguel_quartos[n];

		sc.nextLine();

		for (int i = 1; i < vect.length; i++) {
			System.out.println("Registro #" + i);
			System.out.println("Digite seu nome: ");
			String name = sc.nextLine();
			System.out.println("Digite seu e-mail: ");
			String email = sc.nextLine();
			System.out.println("Qual numero de quarto?: ");
			int n_quarto = sc.nextInt();
			sc.nextLine();
			vect[i] = new aluguel_quartos(name, email, n_quarto);
			while (n_quarto >= 10 || n_quarto <= 0) {
				System.out.println("Quarto invalido! Favor repetir! ");
				System.out.println("Qual numero de quarto?: ");
				n_quarto = sc.nextInt();
				vect[i].setN_quarto(n_quarto);
				sc.nextLine();
			}
		}
		for (int i = 1; i < vect.length; i++) {
			System.out.println("---------------------Cadastro #" + i + "---------------------");
			System.out.println("Nome:" + vect[i].getName());
			System.out.println("E-mail: " + vect[i].getEmail());
			System.out.println("Nº Quarto: " + vect[i].getN_quarto());
		}

		sc.close();
	}

}
