package ConsultorioMedico_Matheus_Cicone;

public class Atendimento {
	
//	atributos
	private String motivoDaConsulta;
	private String exame;
	private String sintoma;
	private Paciente paciente;
	private Medico medico;
//	fim atributos
	
//	metodo construtor padrao
	public Atendimento() {
		
	}
//	fim metodo construtor padrao
	
//	metodo construtor c parametros
	public Atendimento(String m, String e, String s) {
		this.exame = e;
		this.motivoDaConsulta = m;
		this.sintoma = s;
//		fim metodo contrutor c parametros
	}
	
//	getters e setters
	public String getMotivoDaConsulta() {
		return motivoDaConsulta;
	}
	public void setMotivoDaConsulta(String motivoDaConsulta) {
		this.motivoDaConsulta = motivoDaConsulta;
	}
	public String getExame() {
		return exame;
	}
	public void setExame(String exame) {
		this.exame = exame;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
//	fim getters e setters
	
	public void detalhes() {
		System.out.println("   Atendimento Inicial:");
		System.out.println("Motivo da consulta: " + getMotivoDaConsulta());
		System.out.println("Exame: " + getExame());
		System.out.println("Sintomas: " + getSintoma());
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
}// fim classe
