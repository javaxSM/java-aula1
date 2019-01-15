package course;

import java.util.Scanner;

public class estrutura_enquanto_gasolina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int alcool = 0;
			int gasolina = 0;
			int diesel = 0;
			
			System.out.println("Escolha o tipo de combustivel: ");
			System.out.println("\n[1]Alcool\n [2]Gasolina\n [3]Diesel\n [4]Fim\n");
			int escolha = sc.nextInt();
			
			while (escolha != 4) {
				System.out.println("Escolha o tipo de combustivel: ");
				System.out.println("\n[1]Alcool\n [2]Gasolina\n [3]Diesel\n [4]Fim\n");
				if(escolha == 1) {
					alcool =  alcool + 1;
				}
				
				else if(escolha == 2) {
					gasolina = gasolina +1;
				}
				
				else if (escolha == 3) {
					diesel = diesel +1;
				}
				
				escolha = sc.nextInt();
				
		

					}
			System.out.println("MUITO OBRIGADO!");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);
			
			sc.close();
	
		}
}