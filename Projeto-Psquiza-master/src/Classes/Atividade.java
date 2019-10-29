package Classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Atividade {
	private String descricao;
	
	private String resultadoEsperado;
	
	private int duracaoPlanejada;
	
	private String nivelRisco;
	
	private String descricaoRisco;
	
	private Map<String, Item> itens;

	public Atividade(String descricao, String nivelRisco, String descricaoRisco) {
		this.descricao = descricao;
		this.nivelRisco = nivelRisco;
		this.descricaoRisco = descricaoRisco;
		this.itens = new LinkedHashMap<String, Item>();
	}
	
	public void cadastraItem(String nomeItem) {
		if (itens.containsKey(nomeItem)) return;
		itens.put(nomeItem, new Item(nomeItem));
	}
	
	public int contaItensPendentes() {
		int qtdPendentes = 0;
		for (Item item : itens.values()) {
			if (item.getEstadoAtual().equals("PENDENTE")) qtdPendentes++;
		}
		return qtdPendentes;
	}

	public int contaItensRealizados() {
		int qtdRealizados = 0;
		for (Item item : itens.values()) {
			if (item.getEstadoAtual().equals("REALIZADO")) qtdRealizados++;
		}
		return qtdRealizados;
	}
	
	@Override
	public String toString() {
			return descricao + " (" + nivelRisco + " - " + descricaoRisco + ")";
	}
	
	public String exibirAtividade() {
		if (itens.size() == 0) {
			return this.toString();
		}
		else {
			String str_final = this.toString();
			for (Item item:itens.values()) {
				str_final += " | " + item.toString();
			}
			return str_final;
		}
	}
	
}
