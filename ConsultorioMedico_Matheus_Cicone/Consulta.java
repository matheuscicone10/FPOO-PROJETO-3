package ConsultorioMedico_Matheus_Cicone;

import java.sql.Date;
import java.time.LocalDate;

public class Consulta {
//	atributos
	private LocalDate data;
	private double preco;
	private String tipo;
	
//	metodo construtor padrao
	public Consulta() {
		
	}
	
//	metodo construtor c parametros
	public Consulta(LocalDate d, double p, Date h, String t) {
		this.data = d;
		this.preco = p;
		this.tipo = t;
	}
	
//	getters e setters
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate d) {
		this.data = d;
	}
	

	public double getPreco() {
		return preco;
	}

	public void setPreco(double p) {
		this.preco = p;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public void exibir() {
		System.out.println("   INFORMACOES CONSULTA:   ");
		System.out.println("Data: " + getData());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Valor: " + getPreco());
	}
}
