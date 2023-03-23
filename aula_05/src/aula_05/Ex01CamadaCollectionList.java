package aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01CamadaCollectionList {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<>();
		Scanner leia = new Scanner(System.in);

		int i = 1;

		for (i = 1; i <= 5; i++) {
			System.out.println("Digite a " + i + "ª cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("As cores adicionadas foram: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);
		System.out.println("As cores adicionadas em ordem crescente são: ");
		for (String cor : cores) {
			System.out.println(cor);

		}

	}

}
