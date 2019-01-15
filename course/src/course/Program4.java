package course;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n1= sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		char gender = sc.next().charAt(0); // CharAt pega o primeiro caracter.
		
		
		//b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		
		//4.32
		
		System.out.println(n1	);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		
		sc.close();

	}

}
