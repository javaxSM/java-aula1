package course;

import java.util.Scanner;

public class lista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int[] lista = new int[10];
		
		lista[0] = 450;
		lista[1] = 468;
		lista[2] = 852;
		lista[3] = 1236;
		lista[4] = 75623;
		lista[5] = 123011;
		lista[6] = 789;
		lista[7] = 7410;
		lista[8] = 15694545;
		lista[9] = 2;
		
		
		for(int item : lista) {
			System.out.println(item);
		}
		
		System.out.println("--------------------------------------------");
		
		
		int maior = 0;
		int menor = 0;
		for(int item : lista) {
			if(item < menor || menor == 0) {
				menor = item;
			}
			 if(item > maior) {
				maior = item;
			}
				
		}
		
		System.out.println("O menor é: " + menor);
		System.out.println("O maior é: " + maior);
		System.out.println(maior > menor ? "True" : "False"); // condiçao ternaria.
		
		
		sc.close();
	}

}
