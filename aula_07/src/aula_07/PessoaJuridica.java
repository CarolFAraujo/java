package aula_07;

public class PessoaJuridica extends Cliente {
	private String Porte;

	public PessoaJuridica(String nome, String endereco, String telefone, String email, int idade, String porte) {
		super(nome, endereco, telefone, email, idade);
		Porte = porte;
	}

	public String getPorte() {
		return Porte;
	}

	public void setPorte(String porte) {
		Porte = porte;
	}
	public void visualizar() {
		super.visualizar();
		
		System.out.println("Porte: " + this.Porte);
}
}