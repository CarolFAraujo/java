package testafuncionario;

import funcionario.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Carolina", "Desenvolvedora Sênior", 15000.0, "EP", 25);
		Funcionario f2 = new Funcionario("Raissa", "Engenheira de Produção", 15000.0, "Ops", 25);

		System.out.println("Informações do funcionário 1:");
		f1.visualizar();

		System.out.println();

		System.out.println("Informações do funcionário 2:");
		f2.visualizar();
	}

}
