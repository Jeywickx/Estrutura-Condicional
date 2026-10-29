package EstruturaCondicional;

import java.util.Scanner;


public class Exercicio06 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número");
		n1 = sc.nextInt();
		System.out.println("Informe outro número");
		n2 = sc.nextInt();
		System.out.println("Informe mais um número");
		n3 = sc.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println(n1 + " é o maior número");
		} else if (n2>n1 && n2>n3) {
			System.out.println(n2 + " é o maior número");
		} else {
			System.out.println(n3 +" é o maior número");
		}
		
		sc.close();
	}

}
