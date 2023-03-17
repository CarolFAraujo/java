package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03Switch {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		int codigo, quantidade;
		double preco = 0, Total;
		String produto;

		System.out.println("PRODUTOS:");
		System.out.println("Código 1 - Cachorro Quente");
		System.out.println("Código 2 - X-Salada");
		System.out.println("Código 3 - X-Bacon");
		System.out.println("Código 4 - Bauru");
		System.out.println("Código 5 - Refrigerante");
		System.out.println("Código 6 - Suco de Laranja\n");
		System.out.println("Digite o número do código de acordo com seu produto: \n");
		codigo = leia.nextInt();

		System.out.println("Digite a quantidade: \n");
		quantidade = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Cachorro Quente");;
			preco = 10.00;
			System.out.println("Total é de R$" + df.format((preco * quantidade)));
			break;

		case 2:
			System.out.println("X-Salada");
			preco = 15.00;
			System.out.println("Total é de R$" + df.format((preco * quantidade)));
			break;
		case 3:
			System.out.println("X-Bacon");;
			preco = 18.00;
			System.out.println("Total é de R$" + df.format((preco * quantidade)));
			break;
		case 4:
			System.out.println("Bauru");;
			preco = 12.00;
			System.out.println("Total é de R$" + df.format((preco * quantidade)));
			break;
		case 5:
			System.out.println("Refrigerante");;
			preco = 8.00;
			System.out.println("Total é de R$" + df.format((preco * quantidade)));
			break;
		case 6:
			System.out.println("Suco de Laranja");;
			preco = 13.00;
			System.out.println("Total é de R$" + df.format((preco * quantidade)));
			break;
		}
	}

}
