package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		double produto1, produto2, produto3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do primeiro produto");
		produto1 = sc.nextDouble();
		System.out.println("Informe o valor do segundo produto");
		produto2 = sc.nextDouble();
		System.out.println("Informe o valor do terceiro produto");
		produto3 = sc.nextDouble();
		
		if (produto1<produto2 && produto1<produto3) {
			System.out.println("Compre o produto " + produto1);
		}
		
		if (produto2<produto1 && produto2<produto3) {
			System.out.println("compre o produto" + produto2);
		}
		if (produto3<produto2 && produto3< produto1) {
			System.out.println("compre o produto " + produto3);
		}
		
		sc.close();
	}	

}
