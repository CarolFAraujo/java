package funcionario;

public class Vendedor extends Funcionario {

	private String tipo;

	public Vendedor(String nome, String cargo, double salario, String departamento, int idade, String tipo) {
		super(nome, cargo, salario, departamento, idade);
		this.tipo = tipo;
	}

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {
		super.visualizar();
		
		System.out.println("Tipo: " + this.tipo);
		
}
}
