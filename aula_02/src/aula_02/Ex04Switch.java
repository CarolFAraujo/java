package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04Switch {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("###,###,##0.00");

	    int cargo;
	    float salario, reajuste, novoSalario = 0;
	    String nome;

	    System.out.println("Cargo 1 - Gerente");
	    System.out.println("Cargo 2 - Vendedor");
	    System.out.println("Cargo 3 - Supervisor");
	    System.out.println("Cargo 4 - Motorista");
	    System.out.println("Cargo 5 - Estoquista");
	    System.out.println("Cargo 6 - Técnico de TI\n");

	    System.out.println("Digite o nome do colaborador: \n");
	    nome = leia.nextLine();

	    System.out.println("Digite o código do seu cargo: \n");
	    cargo = leia.nextInt();
	    System.out.println("Digite seu salário atual: \n");
	    salario = leia.nextFloat();

	    switch (cargo) {
	        case 1:
	            System.out.println("Gerente");
	            reajuste = 0.1f;
	            novoSalario = salario * (1 + reajuste);
	            System.out.printf("Novo salário: R$ %s\n", df.format(novoSalario));
	            break;
	        case 2:
	            System.out.println("Vendedor");
	            reajuste = 0.07f;
	            novoSalario = salario * (1 + reajuste);
	            System.out.printf("Seu salario reajustado é de: R$ %s\n", df.format(novoSalario));
	            break;
	        case 3:
	            System.out.println("Supervisor");
	            reajuste = 0.09f;
	            novoSalario = salario * (1 + reajuste);
	            System.out.printf("Seu salario reajustado é de: R$ %s\n", df.format(novoSalario));
	            break;
	        case 4:
	            System.out.println("Motorista");
	            reajuste = 0.06f;
	            novoSalario = salario * (1 + reajuste);
	            System.out.printf("Seu salario reajustado é de: R$ %s\n", df.format(novoSalario));
	            break;
	        case 5:
	            System.out.println("Estoquista");
	            reajuste = 0.05f;
	            novoSalario = salario * (1 + reajuste);
	            System.out.printf("Seu salario reajustado é de: R$ %s\n", df.format(novoSalario));
	            break;
	        case 6:
	            System.out.println("Técnico de TI");
	            reajuste = 0.08f;
	            novoSalario = salario * (1 + reajuste);
			

		}

	}
}