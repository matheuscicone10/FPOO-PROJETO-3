package ConsultorioMedico_Matheus_Cicone;

public class Paciente extends Pessoa {
//	atributos
	
	private String endereco;
	private int endereco1;
	private String email;
	
//	construtor padrão
	public Paciente() {
		
	}
	
//	construtor c parametros
	public Paciente(String e, int e1, String em) {
		this.endereco = e;
		this.endereco1 = e1;
		this.email = em;
	}
	
//	metodos getters e setters
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public int getEndereco1() {
		return endereco1;
	}
	public void setEndereco1(int endereco1) {
		this.endereco1 = endereco1;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void detalhes() {
		System.out.println("Nome: " + getPrimeiroNome());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Endereco: " + getEndereco());
		System.out.println("N°: " + getEndereco1());
		System.out.println("E-mail: " + getEmail());
	}

	private String getTelefone() {
		return null;
	}


}
