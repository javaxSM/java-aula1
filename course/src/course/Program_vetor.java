package course;

import java.util.Locale;
import java.util.Scanner;

import util.produto_vetor;

public class Program_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		produto_vetor[] vect = new produto_vetor[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Produto; ");
			String name = sc.nextLine();
			System.out.println("Preço Produto: ");
			double price = sc.nextInt();
			vect[i] = new produto_vetor(name, price);
		}
		
		double soma=0.0;
		for (int i=0;i<vect.length;i++) {
			soma += vect[i].getPrice();
		}
		double media = soma / n;
		System.out.printf("Media: %.2f%n", media);
		
		
		sc.close();

	}

}
