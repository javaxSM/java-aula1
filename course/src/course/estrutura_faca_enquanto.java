package course;

import java.util.Locale;
import java.util.Scanner;

public class estrutura_faca_enquanto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			
		
		System.out.println("Digite um numero: ");
		double n = sc.nextDouble();
		double sqrt = Math.sqrt(n);
		System.out.printf("A raiz quadrada é: %.3f\n " , sqrt);
		
		
		System.out.println("Deseja repetir? ");
		resp = sc.next().charAt(0);
		
		
		} while(resp != 'n');
		sc.close();
	} 

}
