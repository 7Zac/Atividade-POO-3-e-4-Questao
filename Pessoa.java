
public class Pessoa {
	String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "{Nome: " + nome + "}";
	}
}
