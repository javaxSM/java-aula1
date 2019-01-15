package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lista3_exemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> familia = new ArrayList<>();
		
		System.out.print("Quantos membros deseja colocar?: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		
		System.out.println("------------------ ADICIONAR MEMBRO ------------------");
		for(int i = 1; i<n; i++) {
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			familia.add(nome);
		}
		
		System.out.println("Total de membros da familia incluidos: " + familia.size());
		System.out.println(familia);
		
		
		System.out.print("Remova um membro da familia a partir da primeira letra do nome: ");
		char remover = sc.next().charAt(0);
		familia.removeIf(y -> y.charAt(0) == remover);
		
		System.out.println("------------------ REMOVIDO COM SUCESSO ------------------");
		System.out.println(familia);
		
		
		System.out.print("Procure um membro a partir da primeiro letra de eu nome: ");
		char busca = sc.next().charAt(0);
		List<String> busca_membro = familia.stream().filter(x -> x.charAt(0) == busca ).collect(Collectors.toList());
		System.out.println("------------------ BUSCA REALIZADA COM SUCESSO ------------------");
		System.out.println(busca_membro);
		
		
		for(String f : busca_membro) {
			System.out.println(f);
		}
		
		
		
		
		sc.close();
		
		
	}

}
