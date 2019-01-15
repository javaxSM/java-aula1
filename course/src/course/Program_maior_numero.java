package course;

import java.util.Scanner;

public class Program_maior_numero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 3 numeros inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
			int maior = max(a,b,c); // chamada função
			
			showResult(maior); // chamada função 
			
			
			sc.close();

	}
	
	public static int max(int x, int y, int z) { // função
		int aux;
		
		if (x > y && x > z ) {
			aux = x;
		}
		else if (y > x && y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value){ // função
		System.out.println("maior = " + value);
	}

}
