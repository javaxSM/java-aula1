package course;

import java.util.Scanner;

public class exercice2_estrutura_repetitiva {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão
		//lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20]e
		//quantos estão fora do interval.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int n = sc.nextInt();
		
		int dentro = 0;
		int fora = 0;
		
		for (int i = 1; i<n; i++) {
			int x = sc.nextInt();
			if(x>=10 && x <=20) {
				dentro +=1;
			}
			else {
				fora +=1;
			}
		}
			
		System.out.println("Dentro: " + dentro);
		System.out.println("Fora: " + fora);
		sc.close();
		

	}

}
