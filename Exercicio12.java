package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		double horasTrabalhadas, valorHora, salarioBruto, salarioLiquido, IR, FGTS, sindicato;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quanto você ganha por hora");
		valorHora = sc.nextDouble();
		System.out.println("Informe quantas horas você trabalhou no mês");
		horasTrabalhadas = sc.nextDouble();
		salarioBruto = (valorHora*horasTrabalhadas);
		
		if (salarioBruto<= 900) {
			sindicato = (salarioBruto*0.03);
			FGTS = (salarioBruto*0.11);
			salarioLiquido = (salarioBruto - sindicato);
			System.out.println("Salario Bruto: (" + valorHora +")*("+ horasTrabalhadas + ") : R$ " + salarioBruto + "\n"+			 "(-)IR  :                   Isento" + "\n" + "(-)Sindicato (3%)" + "           : R$ " + sindicato + "\n" + "FGTS (11%)" + "                  : R$ "+ FGTS + "\n" +
			 "Total de descontos" + "          : R$ " + sindicato + "\n"+ "salário Liquido" + "             : R$ " + salarioLiquido);
		} else if (salarioBruto>900 && salarioBruto <=1500) {
			sindicato = (salarioBruto*0.03);
			IR = (salarioBruto*0.05);
			FGTS = (salarioBruto*0.11);
			salarioLiquido = salarioBruto - (sindicato + IR);
			System.out.println("Salario Bruto: (" + valorHora +")*("+ horasTrabalhadas + ") : R$ " + salarioBruto + "\n"+
			 "(-)IR (5%):                  : R$ " + IR + "\n" + "(-)Sindicato (3%)" + "            : R$ " + sindicato + "\n" + "FGTS (11%)" + "                   : R$ "+ FGTS + "\n" +
			 "Total de descontos" + "           : R$ " + (sindicato + IR) + "\n"+ "salário Liquido" + "              : R$ " + salarioLiquido);
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			sindicato = (salarioBruto*0.03);
			IR = (salarioBruto*0.10);
			FGTS = (salarioBruto*0.11);
			salarioLiquido = salarioBruto - (sindicato + IR);
			System.out.println("Salario Bruto: (" + valorHora +")*("+ horasTrabalhadas + ") : R$ " + salarioBruto + "\n"+
			 "(-)IR (10%):                  : R$" + IR + "\n" + "(-)Sindicato (3%)" + "            : R$ " + sindicato + "\n" + "FGTS (11%)" + "                   : R$ "+ FGTS + "\n" +
			 "Total de descontos" + "           : R$ " + (sindicato + IR) + "\n"+ "salário Liquido" + "              : R$ " + salarioLiquido);
		} else {
			sindicato = (salarioBruto*0.03);
			IR = (salarioBruto*0.20);
			FGTS = (salarioBruto*0.11);
			salarioLiquido = salarioBruto - (sindicato + IR);
			System.out.println("Salario Bruto: (" + valorHora +")*("+ horasTrabalhadas + ") : R$ " + salarioBruto + "\n"+
			 "(-)IR (20%):                  : R$" + IR + "\n" + "(-)Sindicato (3%)" + "            : R$ " + sindicato + "\n" + "FGTS (11%)" + "                   : R$ "+ FGTS + "\n" +
			 "Total de descontos" + "           : R$ " + (sindicato + IR) + "\n"+ "salário Liquido" + "              : R$ " + salarioLiquido);
			
		}
		
		sc.close();
	}

}
