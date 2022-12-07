
public class PessoaJuridica extends Principal{
protected String cnpj;
protected String razaosocial;


	public PessoaJuridica(String cnpj, String razaosocial) {
		this.cnpj = cnpj;
		this.razaosocial = razaosocial;
	}
	
	public String getcnpj() {
		return cnpj;
	}
	
	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getrazaosocial() {
		return razaosocial;
	}
	
	public void setrazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	
	public String toString() {
		return "{CNPJ: " + cnpj + ", Razão Social: " + razaosocial + "}";
	}




}