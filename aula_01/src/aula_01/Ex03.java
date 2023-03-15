package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		DecimalFormat df =  new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
	
	float salariob,adicionaln,horase,descontos;
			
	System.out.println("Digite o Salário Bruto: ");
	salariob = leia.nextFloat();
	
	System.out.println("Digite o Adicional Noturno: ");
	adicionaln = leia.nextFloat();

	System.out.println("Digite as Horas Extras: ");
	horase = leia.nextFloat();
	
	System.out.println("Digite os descontos: ");
	descontos = leia.nextFloat();
	
	System.out.println("Seu salário líquido é: " + df.format((salariob + adicionaln + (horase * 5) - descontos)));

	}

}
