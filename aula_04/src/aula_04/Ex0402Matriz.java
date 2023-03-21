package aula_04;

import java.util.Scanner;

public class Ex0402Matriz {

	public static void main(String[] args) {

		double[][] notas = new double[10][4];
		double numero = 4.5;


		Scanner leia = new Scanner(System.in);

		for (int iLinha = 0; iLinha < 10; iLinha++) {
			System.out.println("Digite as notas do aluno " + (iLinha + 1));
			for (int iColuna = 0; iColuna < 4; iColuna++) {
				System.out.print("Nota " + (iColuna + 1) + ": ");
				notas[iLinha][iColuna] = leia.nextDouble();
			}
		}

		double[] medias = new double[10];

		for (int iLinha = 0; iLinha < 10; iLinha++) {
			double soma = 0;
			for (int iColuna = 0; iColuna < 4; iColuna++) {
				soma += notas[iLinha][iColuna];
			}
			medias[iLinha] = soma / 4;
		}

		System.out.println("Médias dos alunos:");
		for (int iLinha = 0; iLinha < 10; iLinha++) {
			
		}
	}

}
