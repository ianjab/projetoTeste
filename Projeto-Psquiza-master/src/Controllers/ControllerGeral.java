package Controllers;

public class ControllerGeral {
	
	private ControllerAtividades controladorAtividades;
	
	
	
	public ControllerGeral() {
		this.controladorAtividades = new ControllerAtividades();
	}

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
}
