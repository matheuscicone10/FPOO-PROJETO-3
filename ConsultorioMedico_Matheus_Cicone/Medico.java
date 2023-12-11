package ConsultorioMedico_Matheus_Cicone;

public class Medico extends Pessoa {
	
//	atributos
	private double salario;
	private String especializacao;
	
//	construtor padrão
	public Medico() {
		
	}
	
//	construtor c parametros
	public Medico(double s, String e) {
		
	}
	
//	getters e setters
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	public void detalhes() {
		System.out.println("---INFORMACOES MEDICO:---");
		System.out.println("Nome: " + getPrimeiroNome());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Idade: " + getIdade());
	}
	

}
