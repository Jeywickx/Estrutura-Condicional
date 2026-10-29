package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double primeiraNota, segundaNota, media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua primeira nota");
		primeiraNota = sc.nextDouble();
		System.out.println("Informe sua segunda nota");
		segundaNota = sc.nextDouble();
		media = (primeiraNota+segundaNota)/2;
		
		
		if (media == 10.0 ) {
			System.out.println("Aprovado com distinção");
		} else if (media <= 6.9) {
			System.out.println("Aluno reprovado");
		} else if (media >= 7.0) {
			System.out.println("Aluno aprovado");
		}
		
		sc.close();
		
		}

}
