package Classes;

public class Pesquisador {
	
	private String funcao;
	private String nome;
	private String biografia;
	private String email;
	private String foto;
	private boolean ativo;
	
	public Pesquisador(String nome, String funcao, String biografia, String email, String foto) {
		if(funcao == null) {
			throw new NullPointerException("Campo funcao nao pode ser nulo ou vazio.");
		}
		else if(funcao.equals("")) {
			throw new NullPointerException("Campo funcao nao pode ser nulo ou vazio.");
		}
		else if(nome == null) {
			throw new NullPointerException("Campo nome nao pode ser nulo ou vazio.");
		}
		else if(nome.equals("")) {
			throw new NullPointerException("Campo nome nao pode ser nulo ou vazio.");
		}
		else if(biografia == null) {
			throw new NullPointerException("Campo biografia nao pode ser nulo ou vazio.");
		}
		else if(biografia.equals("")) {
			throw new NullPointerException("Campo biografia nao pode ser nulo ou vazio.");
		}
		else if(email == null) {
			throw new NullPointerException("Campo email nao pode ser nulo ou vazio.");
		}
		else if(email.equals("")) {
			throw new NullPointerException("Campo email nao pode ser nulo ou vazio.");
		}
		else if(foto == null) {
			throw new NullPointerException("Campo fotoURL nao pode ser nulo ou vazio.");
		}
		else if(foto.equals("")) {
			throw new NullPointerException("Campo fotoURL nao pode ser nulo ou vazio.");
		}
		
		ativo = true;
		this.funcao = funcao;
		this.nome = nome;
		this.biografia = biografia;
		
		if(email.contains("@")) {
			String[] validacao = email.split("@");	
			
			if((validacao[0].matches("[a-z]+") | validacao[0].matches("[0-9]+")) & (validacao[1].matches("[a-z]+") | validacao[1].matches("[0-9]+"))) {
				this.email = email;
			}
			else {
				throw new IllegalArgumentException("Formato de email invalido.");
			}
		}
		else {
			throw new IllegalArgumentException("Formato de email invalido.");
		}
		
		if(foto.contains("://")) {
			String[] validacao = foto.split("://");
			
			if(validacao[0].equals("http") | validacao[0].equals("https")) {
				this.foto = foto;
			}
			else {
				throw new IllegalArgumentException("Formato de foto invalido.");
			}	
		}
		else {
			throw new IllegalArgumentException("Formato de foto invalido.");
		}

	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		if(funcao == null) {
			throw new IllegalArgumentException("Campo funcao nao pode ser nulo ou vazio.");
		}
		else if(funcao.equals("")) {
			throw new IllegalArgumentException("Campo funcao nao pode ser nulo ou vazio.");
		}
		
		this.funcao = funcao;
	}

	public String getNome() {		
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null) {
			throw new IllegalArgumentException("Campo nome nao pode ser nulo ou vazio.");
		}
		else if(nome.equals("")) {
			throw new IllegalArgumentException("Campo nome nao pode ser nulo ou vazio.");
		}
		
		this.nome = nome;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		if(biografia == null) {
			throw new IllegalArgumentException("Campo biografia nao pode ser nulo ou vazio.");
		}
		else if(biografia.equals("")) {
			throw new IllegalArgumentException("Campo biografia nao pode ser nulo ou vazio.");
		}
		
		this.biografia = biografia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		if(email == null) {
			throw new IllegalArgumentException("Campo email nao pode ser nulo ou vazio.");
		}
		else if(email.equals("")) {
			throw new IllegalArgumentException("Campo email nao pode ser nulo ou vazio.");
		}
		
		if(email.contains("@")) {
			String[] validacao = email.split("@");	
			if(validacao[0].matches("[a-zA-Z0-9]+") & validacao[1].matches("[a-zA-Z0-9]+")) {
				this.email = email;
			}
			else {
				throw new IllegalArgumentException("Formato de email invalido.");
			}
		}
		else {
			throw new IllegalArgumentException("Formato de email invalido.");
		}
		
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		
		if(foto == null) {
			throw new IllegalArgumentException("Campo fotoURL nao pode ser nulo ou vazio.");
		}
		else if(foto.equals("")) {
			throw new IllegalArgumentException("Campo fotoURL nao pode ser nulo ou vazio.");
		}
		
		if(foto.contains("://")) {
			String[] validacao = foto.split("://");
			
			if(validacao[0].equals("http") | validacao[0].equals("https")) {
				this.foto = foto;
			}
			else {
				throw new IllegalArgumentException("Formato de foto invalido.");
			}	
		}
		else {
			throw new IllegalArgumentException("Formato de foto invalido.");
		}
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		if(this.ativo == ativo) {
			if(ativo == true) {
				throw new IllegalArgumentException("Pesquisador ja ativado");
			}
			else {
				throw new IllegalArgumentException("Pesquisador inativo.");
			}
		}
		else {
			this.ativo = ativo;
		}
	}
	
	public String toString() {
		return nome +" ("+ funcao +") - "+ biografia +" - "+ email +" - "+ foto;
	}
	
	
	
	

}
