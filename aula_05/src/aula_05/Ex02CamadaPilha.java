package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Ex02CamadaPilha {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<>();

		int opcao = -1;
		while (opcao != 0) {
			
			System.out.println("\n**********************************************************");
			System.out.println("**** Menu ****");
			System.out.println("1: Adicionar livro na pilha");
			System.out.println("2: Listar todos os livros: ");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Sair");
			System.out.println("\n**********************************************************");
			System.out.print("Entre com a opção desejada: ");
			
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro: ");
				String nomeLivro = leia.nextLine();
				pilha.push(nomeLivro);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Lista de livros na pilha:");
					for (String livro : pilha) {
						System.out.println(livro);
					}
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					String livroRetirado = pilha.pop();
					System.out.println("Um Livro foi retirado da pilha! " + livroRetirado);
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

			System.out.println();
		}

		leia.close();

	}

}
