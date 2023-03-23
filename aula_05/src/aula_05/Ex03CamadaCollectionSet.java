package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex03CamadaCollectionSet {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();
		int i = 1;

		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número sem repetir: ");
			numeros.add(leia.nextInt());
		}

		numeros.add(null);

		System.out.println("Listar os Elementos do Conjunto: ");

		for (var numero : numeros)
			System.out.println(numero);

		leia.close();

	}

}
