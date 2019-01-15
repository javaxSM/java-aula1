package course;

import java.util.Scanner;

import Entidade.vetor;

public class teste_vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantas pessoas ira cadastras?: ");
		n = sc.nextInt();
		
		vetor[] vect = new vetor[n];
		
		sc.nextLine();
		
		
		for(int i=0;i<vect.length; i++) {
			System.out.println("Pessoa #" + i);
			System.out.println("Nome Pessoa: " );
			String name = sc.nextLine();
			System.out.println("Idade Pessoa: ");
			int age = sc.nextInt();
			sc.nextLine();
			vect[i] = new vetor(name, age);
		}
		
		for(int i=0+1;i<vect.length; i++) {
			
			System.out.println("----------------------Cadastro #" + i + "----------------------");
			System.out.println("Nome: " + vect[i].getName());
			System.out.println("Idade" + vect[i].getAge());
		}
		
		
		sc.close();
	
	}

}
