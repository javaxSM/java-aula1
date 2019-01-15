package course;

import java.util.Locale;
import java.util.Scanner;

public class Program_raio {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			double raio = sc.nextDouble();
			double TT = 3.14159;
			
			double result = TT * (raio * raio);
			
			System.out.printf(String.format("%.4f", result));
			
			sc.close();
			

	}

}
