package Controllers;
/**
* Laboratório de Programação 2 - PROJETO PSQUIZA
*
* @author Lucas Gabriel Soares de Almeida - 119110385
* @author Bruno Machado de Assis - 119110401
* @author Pedro Donato Coelho Neto - 119110362
* @author Ian Junqueira Ayres Barbosa - 119110316 
*/
public class Facade {
	
	// Pesquisadores pesquisadores;
	
	ControllerAtividades controladorAtividades;
	ControllerPesquisador controladorPesquisadores;
	
	public Facade() {
		controladorPesquisadores = new ControllerPesquisador();
		controladorAtividades = new ControllerAtividades();
	}
	
	// PESQUISADORES
	public void cadastraPesquisador(String nome, String funcao, String biografia, String email, String foto) {
		controladorPesquisadores.cadastraPesquisador(nome, funcao, biografia, email, foto);
	}
	
	public void alteraPesquisador(String email, String atributo, String novoValor) {
		controladorPesquisadores.alteraPesquisador(email, atributo, novoValor);
	}
	
	public void desativaPesquisador(String email) {
		controladorPesquisadores.desativaPesquisador(email);
	}
	
	public void ativaPesquisador(String email) {
		controladorPesquisadores.ativaPesquisador(email);
	}
	
	public String exibePesquisador(String email) {
		return controladorPesquisadores.exibePesquisador(email);
	}
	
	public boolean pesquisadorEhAtivo(String email) {
		return controladorPesquisadores.pesquisadorEhAtivo(email);
	}
	

	// ATIVIDADES METODOLOGICAS
	public String cadastraAtividade(String Descricao, String nivelRisco, String descricaoRisco) {
		return controladorAtividades.cadastraAtividade(Descricao, nivelRisco, descricaoRisco);
	}
	
	public void apagaAtividade(String codigo) throws Exception {
		controladorAtividades.apagaAtividade(codigo);
	}
	
	public void cadastraItem(String codigo, String item) throws Exception {
		controladorAtividades.cadastraItem(codigo, item);
	}
	
	public String exibeAtividade(String codigo) throws Exception {
		return controladorAtividades.exibeAtividade(codigo);
	}
	
	public int contaItensPendentes(String codigo) throws Exception {
		return controladorAtividades.contaItensPendentes(codigo);
	}
	
	public int contaItensRealizados(String codigo) throws Exception {
		return controladorAtividades.contaItensRealizados(codigo);
	}
	// FIM ATIVIDADES METODOLOGICAS
}
