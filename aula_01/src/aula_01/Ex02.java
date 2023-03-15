package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		
		DecimalFormat df = new DecimalFormat("###,###,##0.0");
		Scanner leia = new Scanner(System.in);

		float NOTA1, NOTA2, NOTA3, NOTA4;

		System.out.println("Digite a primeira nota: ");
		NOTA1 = leia.nextFloat();

		System.out.println("Digite a segunda nota: ");
		NOTA2 = leia.nextFloat();

		System.out.println("Digite a terceira nota: ");
		NOTA3 = leia.nextFloat();

		System.out.println("Digite a quarta nota: ");
		NOTA4 = leia.nextFloat();

		System.out.println("Média: " + df.format((NOTA1 + NOTA2 + NOTA3 + NOTA4) / 4));

		leia.close();

	}

}
