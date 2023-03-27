package aula_07;

public class PessoaFisica extends Cliente {
private String tipoLegal;

public PessoaFisica(String nome, String endereco, String telefone, String email, int idade, String tipoLegal) {
	super(nome, endereco, telefone, email, idade);
	this.tipoLegal = tipoLegal;
}

public String getTipoLegal() {
	return tipoLegal;
}

public void setTipoLegal(String tipoLegal) {
	this.tipoLegal = tipoLegal;
}
public void visualizar() {
	super.visualizar();
	
	System.out.println("Tipo legal: " + this.tipoLegal);
	
}
}