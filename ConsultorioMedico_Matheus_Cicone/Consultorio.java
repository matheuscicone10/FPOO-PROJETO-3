package ConsultorioMedico_Matheus_Cicone;

public class Consultorio {
//	atributos
	private String endereco;
	private Paciente paciente;
	private Medico medico;
	
//	construtor padrao
	public Consultorio() {
		
	}
	
//	construtor c parametros
	public Consultorio(String e, Paciente p, Medico m) {
		this.endereco = e;
		this.medico = m;
		this.paciente = p;
	}
	
//	getters e setters
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
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
