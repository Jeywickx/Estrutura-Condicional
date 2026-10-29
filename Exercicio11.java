package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		double salario,reajuste=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu salário atual");
		salario = sc.nextDouble();
		
		if (salario<=280.00) {
			reajuste = (salario*0.2) + salario;
			System.out.println("Percentual de aumento aplicado: 20%");
			System.out.println("O valor do aumento " + (salario*0.2));
		} else if (salario>= 280.01 && salario<=700.00) {
			reajuste = (salario*0.15) + salario;
			System.out.println("Percentual de aumento aplicado: 15%"  );
			System.out.println("O valor do aumento " + (salario*0.15));
		} else if (salario>=700.01 && salario<=1500.00) {
			reajuste = (salario*0.1) + salario;
			System.out.println("Percentual de aumento aplicado: 10%"  );
			System.out.println("O valor do aumento " + (salario*0.1));
		} else {
			reajuste = (salario*0.05) + salario;
			System.out.println("Percentual de aumento aplicado: 5%"  );
			System.out.println("O valor do aumento " + (salario*0.05));
		}
		
		System.out.println("salário antes do reajuste " + salario);
		System.out.println("Salário depois do reajuste " + reajuste);
		sc.close();
	}

}
