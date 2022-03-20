import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Estudante e = new Estudante();
		Professor p = new Professor();
		
		int opcao = 0;
		
		do {
			opcao = EntradaSaida.solicitarOpMenu();
			switch(opcao) {
			
			case 1 :
				
				e.setNomeCompleto(EntradaSaida.solicitarNome("informe o nome do estudante"));
				
				while(Validacoes.validarNome(e.getNomeCompleto())==false){
					e.setNomeCompleto(EntradaSaida.solicitarNome("informe o nome do estudante"));
				}
				
				e.setCpf(EntradaSaida.solicitarCpf());
				
				while(Validacoes.validarCpf(e.getCpf())==false) {
					e.setCpf(EntradaSaida.solicitarCpf());
				}
				
				
				e.setDataNascimento(EntradaSaida.solicitarDataNascimento("informe a data de nascimento"));
				
				while(Validacoes.validarDataNascimento(e.getDataNascimento())==false){
					e.setDataNascimento(EntradaSaida.solicitarDataNascimento("informe a data de nascimento"));
				}
			
				break;
				
			case 2 :
				
				p.setNomeCompleto(EntradaSaida.solicitarNome("informe o nome do professor"));
				
				while(Validacoes.validarNome(p.getNomeCompleto())==false){
					p.setNomeCompleto(EntradaSaida.solicitarNome("informe o nome do professor"));
				}
				
				p.setCpf(EntradaSaida.solicitarCpf());
				
				while(Validacoes.validarCpf(p.getCpf())==false) {
					p.setCpf(EntradaSaida.solicitarCpf());
				}
				
				
				p.setSalario(EntradaSaida.solicitarSalario());
				
				while(Validacoes.validarSalario(p.getSalario())==false){
					p.setSalario(EntradaSaida.solicitarSalario());
				}
				
				break;
			case 3 :
				EntradaSaida.mostrarDadosEstudante(e);
				
				break;
				
			case 4 :
				EntradaSaida.mostrarDadosProfessor(p);
				
				break;
				
			case 5 :
				
				e.setNomeCompleto("");
				e.setDataNascimento("");
				e.setCpf(0);
				
				break;
				
			case 6 :
				
				p.setNomeCompleto("");
				p.setCpf(0);
				p.setSalario(0);
				
				break;
				
				
			}
			
			
			
		
		} while(opcao!=7);
		
		
		EntradaSaida.monstrarMessagem();
		
	}

}
