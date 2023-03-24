package funcionario;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	private String departamento;
	private int idade;

	public Funcionario(String nome, String cargo, double salario, String departamento, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.departamento = departamento;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + salario);
		System.out.println("Departamento: " + departamento);
		System.out.println("Idade: " + idade);
	}
}
