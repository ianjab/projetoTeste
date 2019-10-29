package Classes;

public class Item {
	private String estadoAtual;
	
	private String nomeItem;

	public Item(String nomeItem) {
		this.estadoAtual = "PENDENTE";
		this.nomeItem = nomeItem;
	}

	public String getEstadoAtual() {
		return estadoAtual;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	@Override
	public String toString() {
		return estadoAtual + " - " + nomeItem;
	}
	
	
}
