package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01CamadaFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {

			System.out.println("\n**********************************************************");
			System.out.println("1- Adicionar Cliente na Fila");
			System.out.println("2- Listar todos os clientes");
			System.out.println("3- Chamar um cliente");
			System.out.println("0- Sair");
			System.out.println("**********************************************************");
			System.out.println("\nEntre com a opção desejada: ");

			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do Cliente:\n");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nCliente adicionado na fila.\n");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!\n");
				} else {
					System.out.println("\nClientes na fila:\n");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia.\n");
				} else {
					String proximoCliente = fila.poll();
					System.out.println("\nO próximo cliente é:  " + proximoCliente);
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado. Até logo!\n");
				break;
			default:
				System.out.println("\nOpção inválida!\n");
				break;

			}

		}
	}
}
