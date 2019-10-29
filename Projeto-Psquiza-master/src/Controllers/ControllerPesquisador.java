package Controllers;

import java.util.HashMap;

import Classes.Pesquisador;

public class ControllerPesquisador {
	
	private HashMap<String, Pesquisador> pesquisadores;
	
	public ControllerPesquisador() {
		pesquisadores = new HashMap<String, Pesquisador>();
	}
	
	public void cadastraPesquisador(String nome, String funcao, String biografia, String email, String foto) {
		Pesquisador novoPesquisador = new Pesquisador(nome, funcao, biografia, email, foto);
		pesquisadores.put(email, novoPesquisador);
	}
	
	public void alteraPesquisador(String email, String atributo, String novoValor) {
		if(atributo == null) {
			throw new NullPointerException("Atributo nao pode ser vazio ou nulo.");
		}
		else if(atributo.equals("")) {
			throw new NullPointerException("Atributo nao pode ser vazio ou nulo.");
		}
		else if(!pesquisadores.containsKey(email)) {
			throw new IllegalArgumentException("Pesquisador nao encontrado");
		}
		
		if(atributo.equals("NOME")) {
			pesquisadores.get(email).setNome(novoValor);
		}
		else if(atributo.equals("FUNCAO")) {
			pesquisadores.get(email).setFuncao(novoValor);
		}
		else if(atributo.equals("BIOGRAFIA")) {
			pesquisadores.get(email).setBiografia(novoValor);
		}
		else if(atributo.equals("EMAIL")) {
			pesquisadores.get(email).setEmail(novoValor);
			Pesquisador pesquisador = pesquisadores.get(email);
			pesquisadores.remove(email);
			pesquisadores.put(novoValor, pesquisador);
		}
		else if(atributo.equals("FOTO")) {
			pesquisadores.get(email).setFoto(novoValor);
		}
		else {
			throw new IllegalArgumentException("Atributo invalido.");
		}
	}
	
	public void desativaPesquisador(String email) {
		if(email == null) {
			throw new NullPointerException();
		}
		else if(email.equals("")) {
			throw new NullPointerException();
		}
		else if(!pesquisadores.containsKey(email)) {
			throw new IllegalArgumentException("Pesquisador nao encontrado");
		}
		
		
		pesquisadores.get(email).setAtivo(false);
	}
	
	public void ativaPesquisador(String email) {
		if(email == null) {
			throw new NullPointerException();
		}
		else if(email.equals("")) {
			throw new NullPointerException();
		}
		else if(!pesquisadores.containsKey(email)) {
			throw new IllegalArgumentException("Pesquisador nao encontrado");
		}
		
		
		pesquisadores.get(email).setAtivo(true);
	}
	
	public String exibePesquisador(String email) {
		if(email == null) {
			throw new NullPointerException();
		}
		else if(email.equals("")) {
			throw new NullPointerException();
		}
		else if(!pesquisadores.containsKey(email)) {
			throw new IllegalArgumentException("Pesquisador nao encontrado");
		}
		
		return pesquisadores.get(email).toString();
	}
	
	public boolean pesquisadorEhAtivo(String email) {
		if(email == null) {
			throw new NullPointerException();
		}
		else if(email.equals("")) {
			throw new NullPointerException();
		}
		else if(!pesquisadores.containsKey(email)) {
			throw new IllegalArgumentException("Pesquisador nao encontrado");
		}
		
		return pesquisadores.get(email).isAtivo();
	}
	

}
