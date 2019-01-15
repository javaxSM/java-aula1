package course;

import java.util.Scanner;

public class estrutura_repetitiva_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many integer numbers  are you goint to enter?: "); //QTD numeros
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i =1; i <= n; i++) {
			System.out.println("Value #" + i+ ":");
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println("sum: " + sum);
		
		sc.close();

	}

}
