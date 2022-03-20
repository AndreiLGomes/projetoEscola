import javax.swing.JOptionPane;

public class EntradaSaida {
	
	public static int solicitarOpMenu() {		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo \n"
			+ "1- Registrar estudante \n"
			+ "2- Registrar professor \n"
			+ "3- Ver dados do estudante \n"
			+ "4- Ver dados do professor \n"
			+ "5- Apagar dados estudante \n"
			+ "6- Apagar dados professor \n"
			+ "7- Sair do programa"));
		return opcao;
	}
	
	public static String solicitarNome(String nomeCompleto) {		
		String nomeCompletoo = JOptionPane.showInputDialog(nomeCompleto);
		return nomeCompletoo;
	}
	
	
	public static long solicitarCpf() {
		long cpff =  Long.parseLong(JOptionPane.showInputDialog("informe o CPF"));
		return cpff;
	}
	
	public static String solicitarDataNascimento(String nascimento) {		
		String dNascimento = JOptionPane.showInputDialog(nascimento);
		return dNascimento;
	}
	
	

	public static long solicitarSalario() {
		long salario = Integer.parseInt(JOptionPane.showInputDialog("Informe o sálario"));
		return salario;
	}
	

	public static void mostrarDadosEstudante(Estudante e) {
		JOptionPane.showMessageDialog(null, "Os dados do estudante são: \n"
				+ "Nome: "+ e.getNomeCompleto()+"\n"
				+ "Cpf: "+ e.getCpf()+ "\n"
				+ "Data de nascimento: "+ e.getDataNascimento());	
	}
	
	
	public static void mostrarDadosProfessor(Professor p) {
		JOptionPane.showMessageDialog(null, "Os dados do professor são: \n"
				+ "Nome: "+ p.getNomeCompleto()+"\n"
				+ "Cpf: "+ p.getCpf()+ "\n"
				+ "Sálario: "+ p.getSalario());	
	}
	
	public static void monstrarMessagem() {		
		JOptionPane.showMessageDialog(null , "O programa será encerrado e os dados perdidos");
		
	}
	
}
