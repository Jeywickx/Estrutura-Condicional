package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		char letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a letra do seu sexo ");
		letra = sc.next().charAt(0);
		
		if (letra=='f') {
			System.out.println("Sexo Feminino");
		} else if (letra=='m') {
			System.out.println("Sexo Masculino");
		} else {
			System.out.println("Sexo inválido");
		}
		
		sc.close();
	}

}
