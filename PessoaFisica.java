
public class PessoaFisica extends Principal {
protected String cpf;
protected String sobrenome;

	public PessoaFisica(String cpf, String sobrenome){
	this.cpf = cpf;
	this.sobrenome = sobrenome;
}

	public String getcpf() {
	return cpf;
}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getsobrenome() {
		return sobrenome;
	}
	
	public void setsobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String toString() {
		return "{CPF: " + cpf + ", Sobrenome: " + sobrenome + "}";
	}




}
