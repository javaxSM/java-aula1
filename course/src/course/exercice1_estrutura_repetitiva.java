package course;

import java.util.Scanner;

public class exercice1_estrutura_repetitiva {

	public static void main(String[] args) {
		// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
		//um valor por linha, inclusive o X, se for o caso. 

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero que deseja saber os impares?: ");
		int x = sc.nextInt();
			
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println("impares:" + i);
			}
		}
		
		
		sc.close();
	}

}
