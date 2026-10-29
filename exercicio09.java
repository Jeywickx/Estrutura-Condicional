package EstruturaCondicional;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		int n1, n2, n3, maior=0, menor=0, meio=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("informe um número");
		n1 = sc.nextInt();
		System.out.println("Informe outro número");
		n2 = sc.nextInt();
		System.out.println("Informe mais um número");
		n3 = sc.nextInt();
		
		if (n1>n2 && n1>n3) {
			maior =n1;
			if (n2>n3) {
				menor = n3;
				meio = n2;
			} else {
				menor = n2;
				meio = n3;
			}
		} else if (n2>n1 && n2>n3) {
			maior = n2;
			if (n3>n1) {
				menor = n1;
				meio = n3;
			} else {
				menor = n3;
				meio = n1;
			}
		} else if (n3>n1 && n3>n2) {
			maior = n3;
			if (n2>n1) {
				menor = n1;
				meio = n2;
			} else {
				menor = n2;
				meio = n1;
			}
		}
		
		System.out.println(maior);
		System.out.println(meio);
		System.out.println(menor);
		
		sc.close();
	}

}
