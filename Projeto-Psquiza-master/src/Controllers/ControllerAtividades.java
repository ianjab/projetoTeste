package Controllers;

import java.util.HashMap;
import java.util.Map;

import Classes.Atividade;

public class ControllerAtividades {
	private Map<String, Atividade> atividades;
	
	private int idAtual = 1;

	public ControllerAtividades() {
		atividades = new HashMap<String, Atividade>();
	}
	
	public String cadastraAtividade(String Descricao, String nivelRisco, String descricaoRisco) {
		if (descricaoRisco == null || descricaoRisco.trim().isEmpty()) throw new IllegalArgumentException("Campo descricaoRisco nao pode ser nulo ou vazio.");
		if (Descricao == null || Descricao.trim().isEmpty()) throw new IllegalArgumentException("Campo Descricao nao pode ser nulo ou vazio.");
		if (nivelRisco == null || nivelRisco.trim().isEmpty()) throw new IllegalArgumentException("Campo nivelRisco nao pode ser nulo ou vazio.");
		if (!nivelRisco.equals("BAIXO") && !nivelRisco.equals("MEDIO") && !nivelRisco.equals("ALTO")) throw new IllegalArgumentException("Valor invalido do nivel do risco.");
		String id = "A"+idAtual;
		atividades.put(id, new Atividade(Descricao, nivelRisco, descricaoRisco));
		idAtual++;
		return id;
	}
	
	public void apagaAtividade(String codigo) throws Exception {
		if (codigo == null || codigo.trim().isEmpty()) throw new IllegalArgumentException("Campo codigo nao pode ser nulo ou vazio.");
		if (!atividades.containsKey(codigo)) throw new Exception("Atividade nao encontrada");
		if (codigo == null || codigo.trim().isEmpty()) throw new IllegalArgumentException("Campo codigo nao pode ser nulo ou vazio.");
		atividades.remove(codigo);
	}
	
	public void cadastraItem(String codigo, String item) throws Exception {
		if (codigo == null || codigo.trim().isEmpty()) throw new IllegalArgumentException("Campo codigo nao pode ser nulo ou vazio.");
		if (item == null || item.trim().isEmpty()) throw new IllegalArgumentException("Item nao pode ser nulo ou vazio.");
		if (!atividades.containsKey(codigo)) throw new Exception("Atividade nao encontrada");
		atividades.get(codigo).cadastraItem(item);
	}
	
	public String exibeAtividade(String codigo) throws Exception {
		if (codigo == null || codigo.trim().isEmpty()) throw new IllegalArgumentException("Campo codigo nao pode ser nulo ou vazio.");
		if (!atividades.containsKey(codigo)) throw new Exception("Atividade nao encontrada");
		return atividades.get(codigo).exibirAtividade();
	}
	
	public int contaItensPendentes(String codigo) throws Exception {
		if (codigo == null || codigo.trim().isEmpty()) throw new IllegalArgumentException("Campo codigo nao pode ser nulo ou vazio.");
		if (!atividades.containsKey(codigo)) throw new Exception("Atividade nao encontrada");
		return atividades.get(codigo).contaItensPendentes();
	}
	
	public int contaItensRealizados(String codigo) throws Exception {
		if (codigo == null || codigo.trim().isEmpty()) throw new IllegalArgumentException("Campo codigo nao pode ser nulo ou vazio.");
		if (!atividades.containsKey(codigo)) throw new Exception("Atividade nao encontrada");
		return atividades.get(codigo).contaItensRealizados();
	}
}
