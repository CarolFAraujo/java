package aula_04;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		int[][] matrizInteiros = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		float matrizFloat[][] = new float[2][3];
		
		for (int iLinha = 0; iLinha < matrizInteiros.length; iLinha ++) { //i é indice, só para diminuir. Primeiro laço (primeiro for) percorre as linhas
			for (int iColuna = 0; iColuna < matrizInteiros.length; iColuna ++) { //Segundo laço (segundo for) percorre as colunas
				System.out.println(matrizInteiros[iLinha][iColuna]); //i é indice, só para diminuir. Primeiro laço (primeiro for) percorre as linhas
			}


			for (int iLinha1 = 0; iLinha1 < matrizFloat.length; iLinha1 ++) { //i é indice, só para diminuir. Primeiro laço (primeiro for) percorre as linhas
				for (int iColuna = 0; iColuna < matrizFloat[iLinha1].length; iColuna ++) { //Segundo laço (segundo for) percorre as colunas
					System.out.println("Digite um número: "); //i é indice, só para diminuir. Primeiro laço (primeiro for) percorre as linhas
					matrizFloat[iLinha1][iColuna] = leia.nextFloat();
							
	}
	

	}
		}
	}
}

