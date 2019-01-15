package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.funcionarios_auto1;



public class funcionario_automatizado1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		List<funcionarios_auto1> funcionario = new ArrayList<>();
		
		
		System.out.print("Quantos funcionarios?: ");
		int n = sc.nextInt();
		
		for(int i=0; i <n; i++) {
			System.out.println("Funcionario # " + i);
			System.out.println("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			sc.nextLine();
			funcionario.add(new funcionarios_auto1(id, nome, salario));
			
		}
		
		System.out.println("--------- Lista Funcionarios ---------");
		
				for(funcionarios_auto1 x : funcionario) {
					System.out.println(x.toString());
				}
			
			System.out.println("--------- Aumento? ---------");
			System.out.println("Deseja dar algum aumento?: [S/N]");
			char deseja = sc.next().charAt(0);
			if(deseja == 'S' || deseja == 's') {
				System.out.println("ID que sera aumentado: ");
				int id = sc.nextInt();
				funcionarios_auto1 aumento = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if(aumento == null) {
					System.out.println("ID nao encontrado!");
					
				}
				
				else {
					System.out.println("Porcentagem aumento: ");
					double porcentagem = sc.nextDouble();
					aumento.Porcentagem(porcentagem);
					sc.nextLine();
					System.out.println("--------- Lista Funcionarios (com aumento) ---------");
					for(funcionarios_auto1 w : funcionario) {
						System.out.println(w);
					}
					
				}
				
			}
			else {
			System.out.println("--------- Lista Funcionarios (Sem aumento) ---------");
			for(funcionarios_auto1 z : funcionario)
			System.out.println(z.toString());
			}
			
			
		sc.close();

	}

}
