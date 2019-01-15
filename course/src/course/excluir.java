package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class excluir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos membros?: ");
		int qtd = sc.nextInt();
		
		sc.nextLine();
		
		
		List<String> nomes = new ArrayList<>();
		for(int y=0; y<qtd; y++) {
			System.out.println("Nome do membro: ");
			String membros = sc.nextLine();
			nomes.add(membros);
		}
	
		
		System.out.println("-------- Membros --------");
		for(String x : nomes) {
			System.out.println(x);
		}
		
		System.out.println("Busca de membro especifico: ");
		char p = sc.next().charAt(0);
		
		List<String> nomes_personalizados = nomes.stream().filter(f -> f.charAt(0) == p).collect(Collectors.toList());
		
		System.out.println(nomes_personalizados);
		
		for(String z : nomes_personalizados);
		
		System.out.println(nomes_personalizados);
		
		System.out.println("Busca apenas de 1 membro especifico: "); 
		char busca = sc.next().charAt(0);
		
		String name = nomes.stream().filter(h -> h.charAt(0) == busca).findFirst().orElse("Não encontrado!");
		System.out.println(name);
		
		sc.close();
		
		

	}

}
