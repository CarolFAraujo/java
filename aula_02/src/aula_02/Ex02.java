package aula_02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número inteiro e confira se é: par ou ímpar, poisitivo ou negativo: ");
		numero = leia.nextInt();

		if (numero % 2 == 0 && numero > 0) 
			System.out.println("Este número é par e positivo!");
		
		else if (numero % 2 != 0 && numero < 0)
				System.out.println("Este número é  ímpar e negativo!");
		
		else if(numero % 2 == 0 && numero > 0) 
					System.out.println("Este número é par e positivo!");
		
		else if (numero %2 == 0 && numero < 0) {
			System.out.println("Este número é par e negativo!");
		}else {
			System.out.println("Este número é ímpar e positivo!");
		
		leia.close();

	}

}
	}
	
