package course;

import java.util.Locale;
import java.util.Scanner;

public class estruturaEnquanto_senha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Password: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Password incorrect!");
			System.out.println("Enter a Password!: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Access allowed! ");
		
		
		sc.close();

	}

}
