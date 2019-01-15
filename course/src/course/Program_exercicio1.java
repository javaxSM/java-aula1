package course;

import java.util.Scanner;

public class Program_exercicio1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int soma = a + b;
		
		System.out.printf(String.format("Soma = %d ", soma));
		
		
		
		sc.close();
	}

}
