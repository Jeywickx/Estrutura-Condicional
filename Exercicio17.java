package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		int ano;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número correspondente a um determinado ano para saber se ele é bissexto");
		ano = sc.nextInt();
		if ((ano % 100 == 0 && ano % 400 == 0) || ano % 4 == 0 && ano % 100 != 0) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é bissexto");
		}
		sc.close();
	}
}

