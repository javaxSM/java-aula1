package course;

import java.util.Locale;
import java.util.Scanner;

public class Program4_exercice {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String Name = sc.nextLine();
		int number = sc.nextInt();
		double price = sc.nextDouble();
		String full = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(Name);
		System.out.println(number);
		System.out.println(String.format("%.2f",price));
		System.out.println(full);
		System.out.println(age);
		System.out.println(height);
		
		
		
		sc.close();

	}

}
