package course;

import java.util.Locale;
import java.util.Scanner;

import util.converter_dolar;

public class dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		converter_dolar din = new converter_dolar();
		
		System.out.println("Quanto que esta o preço do DOLAR $?: ");
		din.dolar = sc.nextDouble();
		System.out.println("Quanto tem em real R$?: ");
		din.reais = sc.nextDouble();
		
		System.out.println(din.toString());
		
		sc.close();

	}

}
