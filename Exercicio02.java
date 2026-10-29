package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double valor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor");
		valor = sc.nextDouble();
		
		if (valor>0) {
			System.out.println("o valor digitado é positivo");
		} else {
			System.out.println("o valor digitado é negativo");
		}
		
		sc.close();
	}

}
