package ConsultorioMedico_Matheus_Cicone;

public class Pessoa {
	private String primeiroNome;
	private String Sobrenome;
	private int idade;
	private int CPF;
	private char genero;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String p, String s, int i, int c, char g) {
		this.primeiroNome = p;
		this.Sobrenome = s;
		this.idade = i;
		this.CPF = c;
		this.genero = g;
	}
	
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	
	public String getSobrenome() {
		return Sobrenome;
	}
	
	public void setSobrenome(String Sobrenome) {
		this.Sobrenome = Sobrenome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getCPF() {
		return CPF;
	}
	
	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public void todosOsDados() {
		System.out.println("   Dados: ");
		System.out.println("Nome: " + getPrimeiroNome());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Idade: " + getIdade());
		System.out.println("CPF: " + getCPF());
		System.out.println("Genero: " + getGenero());
	}

}
