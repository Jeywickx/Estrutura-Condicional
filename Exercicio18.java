package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma data válida");
		System.out.println("Informe o dia");
		dia = sc.nextInt();
		System.out.println("Informe o mês");
		mes = sc.nextInt();
		System.out.println("Informe o ano");
		ano = sc.nextInt();
		if (dia < 1 || dia > 31) {
			System.out.println("A data informada é inválida");
		} else if (mes < 1 || mes > 12) {
			System.out.println("A data informada é inválida");
		} else if (ano < 1) {
			System.out.println("A data informada é inválida");
		}
		  else if ((dia <= 30 && mes == 4) || (dia <= 30 && mes == 6) || (dia <= 30 && mes == 9) || (dia <= 30 && mes == 11 )) {
			System.out.println("A data informada é válida");
		} else if (dia <= 29 && mes == 2 && (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
			System.out.println("A data é válida");
		} else if (dia <= 28 && mes == 2) {
			System.out.println("A data informada é valida");
		} else if ((dia <= 31 && mes == 1) || (dia <= 31 && mes == 3) || (dia <= 31 && mes == 5) || (dia <= 31 && mes == 7) || (dia <=31 && mes == 8) || (dia <= 31 && mes == 10) || (dia <= 31&& mes == 12)) {
			System.out.println("a data informada é válida");
		} else {
			System.out.println("A data informada é inválida");
		}
		sc.close();


	}
}






