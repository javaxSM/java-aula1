package course;

import java.util.Scanner;

public class exercice_estruturasTotatis_repetitivas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidades de numeros: ");
		int n = sc.nextInt();
		
		while (n < 0) {
			System.out.println("Valor negativo! Tente novamente: ");
			 n = sc.nextInt();
			
		}
		
		int maior = 0;
		int x = 0;
		for (int i = 1; i<=n; i++) {
			System.out.println("Valor #" + i + ":");
			x = sc.nextInt();
			if (x > maior) {
				maior = x;
			}
			
		}
		
		
		System.out.println("Maior Valor: " + maior);
		
		
		
		sc.close();

	}

}
