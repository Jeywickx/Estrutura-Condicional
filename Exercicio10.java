package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char turno;
		System.out.println("Informe o turno que você estuda: \nM - Matutino\nV - Vespertino\nN - Noturno");
		turno = sc.next().charAt(0);
		
		if (turno == 'm' || turno == 'M') {
			System.out.println("Bom dia");
		} else if (turno == 'v' || turno == 'V') {
			System.out.println("Boa tarde");
		} else if (turno == 'n' || turno == 'N') {
			System.out.println("Boa noite");
		} else {
			System.out.println("Valor inválido");
		}
		
		sc.close();
	}

}
