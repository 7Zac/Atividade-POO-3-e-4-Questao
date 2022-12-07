
public class Principal {
	public static void main(String[] args) {
		
		PessoaFisica p = new PessoaFisica("123.456.789-00", "Lopes");
		System.out.println(p);
		
		PessoaJuridica pj = new PessoaJuridica("12.345.678/0001-90", "Empresário");
		System.out.println(pj);
		
		Pessoa p1 = new Pessoa("Isaac Lopes Alencar");
		System.out.println(p1);
		
	}
}
