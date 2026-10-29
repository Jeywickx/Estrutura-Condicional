package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		char letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma letra");
		letra = sc.next().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra informada é uma vogal");
		} else {
			System.out.println("A letra informada é uma consoante");
		}
		
		sc.close();
	}

}
