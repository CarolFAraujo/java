package testafuncionario;

import funcionario.Funcionario;
import funcionario.Gerente;
import funcionario.Vendedor;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Carolina", "Desenvolvedora Sênior", 15000.0, "EP", 25);
		Funcionario f2 = new Funcionario("Raissa", "Engenheira de Produção", 15000.0, "Ops", 25);

	
		Gerente g1 = new Gerente("Carolina", "Desenvolvedora Sênior", 15000.0, "EP", 25, "Manhã", 2);
	    g1.visualizar();

	    Vendedor v1 = new Vendedor("Maria", "Vendedor", 15000.0, "EP", 25, "Interno");
	    v1.visualizar();
		
		}

}
