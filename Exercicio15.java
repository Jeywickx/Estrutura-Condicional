package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		double lado1, lado2, lado3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do primeiro lado do triângulo");
		lado1 = sc.nextDouble();
		System.out.println("Informe o valor do segundo lado do triângulo");
		lado2 = sc.nextDouble();
		System.out.println("Informe o valor do terceiro lado do triângulo");
		lado3 = sc.nextDouble();
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isósceles ");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Os lados informados não foram um triângulo");
		}
		sc.close();

	}

}
