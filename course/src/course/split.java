package course;

import java.util.Scanner;

public class split {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			
		System.out.println("Digite 3 frutas na mesma linha: ");
		String x = sc.nextLine();
		
		String [] vctor = x.split(" ");
		
		System.out.println(vctor[0]);
		System.out.println(vctor[1]);
		System.out.println(vctor[2]);
		
		
		System.out.println("Deseja refazer? ");
		resp = sc.next().charAt(0);
		
		} while(resp != 'n');
			sc.close();

	}

}
