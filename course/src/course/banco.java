package course;

import java.util.Locale;
import java.util.Scanner;
import util.cadastro_banco;

public class banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char repetir, resp;
		
		do {
			cadastro_banco conta;

			System.out.print("Digite o numero conta: ");
			int number = sc.nextInt();
			System.out.print("Digite seu nome: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Tem deposito inicial? [S/N] ");
			resp = sc.next().charAt(0);
			if (resp == 's' || resp == 'S') {
				System.out.print("Digite o valor deposito: ");
				double initialDeposit = sc.nextDouble();
				conta = new cadastro_banco(number, holder, initialDeposit);
			} else {
				conta = new cadastro_banco(number, holder);
			}

			System.out.println();
			System.out.println("Dados Conta: \n " + conta.toString());

			System.out.println();

			System.out.println("---------------------DADOS DA CONTA ATUALIZADOS:--------------------- ");
			System.out.println(conta.toString());

			System.out.println("Deseja fazer alguma alteração? [S/N] ");
			resp = sc.next().charAt(0);
			if (resp == 's') {
				System.out.println("Certo! Escolha o que deseja alterar: \n [1] Nome Titular \n [2] Numero Conta \n [3] Os dois \n [4] Sair");
				int escolha = sc.nextInt();

				switch (escolha) {

				case 1:
					sc.nextLine();
					System.out.println("---------------------ATUALIZAR DADOS(NOVO TITULAR):--------------------- ");
					System.out.print("Novo Titular: ");
					holder = sc.nextLine();
					conta.setHolder(holder);
					break;

				case 2:
					System.out.println("---------------------ATUALIZAR DADOS(NOVA CONTA):--------------------- ");
					System.out.print("Nova Conta: ");
					number = sc.nextInt();
					conta.setNumber(number);
					break;

				case 3:
					System.out.println("---------------------ATUALIZAR DADOS:--------------------- ");
					sc.nextLine();
					System.out.println("Novo titular: ");
					holder = sc.nextLine();
					conta.setHolder(holder);
					System.out.println("Nova Conta: ");
					number = sc.nextInt();
					conta.setNumber(number);
					break;
					
				case 4:
					System.out.println("Saindo...");
					break;
				}
			}

			System.out.println(conta.toString());

			System.out.println();

			System.out.println("Deseja repetir ");
			repetir = sc.next().charAt(0);

		} while (repetir != 'n');

		sc.close();

	}

}
