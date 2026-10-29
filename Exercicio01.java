package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		n1 = sc.nextInt();
		System.out.println("Informe outro número inteiro");
		n2 = sc.nextInt();
		
		if (n1>n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
		
		sc.close();
	}

}
