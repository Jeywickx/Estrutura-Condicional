package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		double nota1, nota2, media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua primeira nota");
		nota1 = sc.nextDouble();
		System.out.println("Informe sua segunda nota");
		nota2 = sc.nextDouble();
		media = (nota1 + nota2) / 2;
		
		if (media >= 9.0 && media <= 10.0) {
			System.out.println("Primeira nota: " + nota1 +"\n" + "Segunda nota: " + nota2 +"\n" + "Média: " + media +"\n" +"Conceito A"+"\n" + "Aprovado");
		} else if (media >= 7.5 && media < 9.0) {
			System.out.println("Primeira nota: " + nota1 +"\n" + "Segunda nota: " + nota2 +"\n" + "Média: " + media +"\n" +"Conceito B"+"\n" + "Aprovado");
		} else if (media >= 6.0 && media < 7.5) {
			System.out.println("Primeira nota: " + nota1 +"\n" + "Segunda nota: " + nota2 +"\n" + "Média: " + media +"\n" +"Conceito C"+"\n" + "Aprovado");
		} else if (media >= 4.0 && media < 6.0) {
			System.out.println("Primeira nota: " + nota1 +"\n" + "Segunda nota: " + nota2 +"\n" + "Média: " + media +"\n" +"Conceito D"+"\n" + "Reprovado");
		} else if (media >= 0 && media < 4.0) {
			System.out.println("Primeira nota: " + nota1 +"\n" + "Segunda nota: " + nota2 +"\n" + "Média: " + media +"\n" +"Conceito E"+"\n" + "Reprovado");
		}
		
		sc.close();
	}

}
