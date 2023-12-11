package ConsultorioMedico_Matheus_Cicone;

public class Funcionario extends Pessoa {
//	atributos
	private double salario;
	private String cargo;
	
//	metodo contrutor padrao
	public Funcionario() {
		
	}
	
//	metodo construtor c parametros
	public Funcionario(double s, String c) {
		this.salario = s;
		this.cargo = c;
		
	}
	
//	getters e setters
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void exibir() {
		System.out.println("   Informacoes do funcionario: ");
		System.out.println("Nome: " + getPrimeiroNome());
		System.out.println("Cargo: " + getCargo());
	}
}
