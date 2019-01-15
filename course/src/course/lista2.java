package course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista2 {

	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<>();
		
		
		
		lista.add("Eduardo");
		lista.add("Davi");
		lista.add("Vanessa");
		lista.add("Neusa");
		
		for(String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista: " + lista.size());
		
		System.out.println("--------------- Itens removidos ---------------");
		
		lista.removeIf(x -> x.charAt(0) == 'V'); // Remocao com predicado
		
		
		for(String x : lista) {
			System.out.println(x);
			 
		}
		lista.add("Marina");
		lista.add("Marcos");
		System.out.println("Tamanho da lista: " + lista.size());
		
		System.out.println("--------------- Itens buscados ---------------");
		System.out.println("index of Davi: " + lista.indexOf("Davi")); // Busca posicao em numeral
		System.out.println("index of Vanessa: " + lista.indexOf("Vanessa"));
		
		System.out.println("--------------- Nomes em espeficio ---------------");
		List<String> result = lista.stream().filter(y -> y.charAt(0) == 'M').collect(Collectors.toList()); // Filtro somente um nome especifico
		
	
		for(String y : result) {
			System.out.println(y);
		}
		
		System.out.println("--------------- 1° Nome especifico ---------------");
		String nome = lista.stream().filter(w -> w.charAt(0) == 'M').findFirst().orElse("Valor nao encontrado"); 
		System.out.println(nome);
	}

}
