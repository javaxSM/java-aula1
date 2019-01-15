package course;

import java.util.Locale;
import java.util.Scanner;

import Entidade.calcu_triangulo;

public class Program_calculoTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		calcu_triangulo triangulo = new calcu_triangulo();
		
		
		System.out.println("Digite a area A: ");
		triangulo.a = sc.nextDouble();
		
		System.out.println("Digite a area B: ");
		triangulo.b = sc.nextDouble();
		
		System.out.println();
		System.out.println(triangulo.ToString());
		
		sc.close();

	}

}
