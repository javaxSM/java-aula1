package course;

import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class calc_circuferencia_constante {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do RAIO: ");
		double raio = sc.nextDouble();
		
		double c = calculator.circuferencia(raio);
		
		double v = calculator.volume(raio);
		
		System.out.printf("\n Circuferencia: %.2f", c);
		System.out.printf("\n Volume: %.2f", v);
		System.out.printf("\n Valor de PI: %.2f ", calculator.PI);
		
		sc.close();
			
		}

	}


