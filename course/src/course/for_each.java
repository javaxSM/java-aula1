package course;

import java.util.Scanner;

public class for_each {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] vect = new String[] {"Maria","Joao","Lucas"};
		
		
		for(int i =0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------------");
		for(String nome_que_voce_quer : vect) {
			System.out.println(nome_que_voce_quer );
		}		
		
		sc.close();
	}
	
	
	
	
	

}
