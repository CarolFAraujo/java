package aula_02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int A, B, C;

		System.out.println("Digite o número para A: ");
		A = leia.nextInt();
		System.out.println("Digite o número para B: ");
		B = leia.nextInt();
		System.out.println("Digite o número para C: ");
		C = leia.nextInt();

		System.out.println("Resultado da soma: " + (A + B));

		if (A + B > C)
			System.out.println("A soma de A + B é maior do que C.");
		else if (A + B < C)
			System.out.println("A soma de A + B é menor do que C.");
		if (A + B == C)
			System.out.println("A soma de A + B é igual a C.");

		leia.close();
	}

}
