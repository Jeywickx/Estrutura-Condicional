package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro e eu irei exibir o dia da semana correspondente");
		numero = sc.nextInt();
		if (numero == 1) {
			System.out.println("1 - Domingo ");
		} else if (numero == 2) {
			System.out.println("2 - Segunda");
		} else if (numero == 3) {
			System.out.println("3 - Terça");
		} else if (numero == 4) {
			System.out.println("4 - Quarta");
		} else if (numero == 5) {
			System.out.println("5 - Quinta");
		} else if (numero == 6) {
			System.out.println("6 - Sexta");
		} else if (numero == 7) {
			System.out.println("7 - Sábado");
		} else {
			System.out.println("Valor inválido");
		}
		
		sc.close();
		
	}

}
