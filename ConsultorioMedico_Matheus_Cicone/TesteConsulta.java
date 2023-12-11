package ConsultorioMedico_Matheus_Cicone;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteConsulta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
//		FUNCIONARIO-------------------------------------------------------------------------------
		System.out.println("---FUNCIONARIO:---");
		Funcionario f1 = new Funcionario();
		System.out.println("Nome funcionario:");
		String Funcionario = entrada.next();
		f1.setPrimeiroNome(Funcionario);
		System.out.println("Digite o cargo do funcionario que deseja falar:");
		String Funcionario1 = entrada.next();
		f1.setCargo(Funcionario1);
		f1.exibir();
		
//		PACIENTE-----------------------------------------------------------------------------------
		System.out.println("---PACIENTE 1:---");
		Paciente p1 = new Paciente();
		System.out.println("Nome: ");
		String Paciente = entrada.next();
		p1.setPrimeiroNome(Paciente);
		System.out.println("Sobrenome: ");
		String Paciente1 = entrada.next();
		p1.setSobrenome(Paciente1);
		System.out.println("Idade: ");
		int Paciente12 = entrada.nextInt();
		p1.setIdade(Paciente12);
		System.out.println("Digite seu endereco (Bairro e Rua): ");
		String Paciente13 = entrada.next();
		p1.setEndereco(Paciente13);
		System.out.println("Digite o Numero de seu endereco: ");
		int Paciente14 = entrada.nextInt();
		p1.setEndereco1(Paciente14);
		System.out.println("E-mail: ");
		String Paciente16 = entrada.next();
		p1.setEmail(Paciente16);
		p1.detalhes();
		
//		PACIENTE 2-------------------------------------------------------------------------------
		System.out.println("---PACIENTE 2:---");
		Paciente p2 = new Paciente();
		System.out.println("Nome: ");
		String Paciente2 = entrada.next();
		p2.setPrimeiroNome(Paciente2);
		System.out.println("Sobrenome: ");
		String Paciente21 = entrada.next();
		p2.setSobrenome(Paciente21);
		System.out.println("Idade: ");
		int Paciente22 = entrada.nextInt();
		p2.setIdade(Paciente22);
		System.out.println("Digite seu endereco (Bairro e Rua): ");
		String Paciente23 = entrada.next();
		p2.setEndereco(Paciente23);
		System.out.println("Digite o Numero de seu endereco: ");
		int Paciente24 = entrada.nextInt();
		p2.setEndereco1(Paciente24);
		System.out.println("E-mail: ");
		String Paciente26 = entrada.next();
		p2.setEmail(Paciente26);
		p2.detalhes();
		
//		PACIENTE 3-----------------------------------------------------------------------------
		System.out.println("---PACIENTE 3:---");
		Paciente p3 = new Paciente();
		System.out.println("Nome: ");
		String Paciente3 = entrada.next();
		p3.setPrimeiroNome(Paciente3);
		System.out.println("Sobrenome: ");
		String Paciente31 = entrada.next();
		p3.setSobrenome(Paciente31);
		System.out.println("Idade: ");
		int Paciente32 = entrada.nextInt();
		p3.setIdade(Paciente32);
		System.out.println("Digite seu endereco (Bairro e Rua): ");
		String Paciente33 = entrada.next();
		p3.setEndereco(Paciente33);
		System.out.println("Digite o Numero de seu endereco: ");
		int Paciente34 = entrada.nextInt();
		p3.setEndereco1(Paciente34);
		System.out.println("E-mail: ");
		String Paciente36 = entrada.next();
		p3.setEmail(Paciente36);
		p3.detalhes();
		
//		ATENDIMENTO-------------------------------------------------------------------------------
		System.out.println("---ATENDIMENTO:---");
		Atendimento a1 = new Atendimento();
		System.out.println("Qual o motivo da sua consulta? ");
		String Atendimento = entrada.next();
		a1.setMotivoDaConsulta(Atendimento);
		System.out.println("Exame que deseja fazer: ");
		String Atendimento2 = entrada.next();
		a1.setExame(Atendimento2);
		System.out.println("Quais sintomas que esta sentindo? ");
		String Atendimento3 = entrada.next();
		a1.setSintoma(Atendimento3);
		a1.detalhes();
		
//		MEDICO-------------------------------------------------------------------------------------
		System.out.println("---MEDICO:---");
		Medico m1 = new Medico();
		System.out.println("Nome: ");
		String Medico = entrada.next();
		m1.setPrimeiroNome(Medico);
		System.out.println("Sobrenome: ");
		String Medico1 = entrada.next();
		m1.setSobrenome(Medico1);
		System.out.println("Idade: ");
		int Medico2 = entrada.nextInt();
		m1.setIdade(Medico2);
		m1.detalhes();
		
//		CONSULTA-----------------------------------------------------------------------------------
		System.out.println("---CONSULTA:---");
		Consulta c1 = new Consulta();
		System.out.println("Qual consulta voce deseja?");
		String consulta = entrada.next();
		c1.setTipo(consulta);
		LocalDate data = null;
		System.out.println("Qual o melhor dia para o agendamento?");
		String data11 = entrada.next();
		data = LocalDate.parse(data11, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		c1.setData(data);
		c1.setPreco(150);
		c1.exibir();
	
	}
		
}
