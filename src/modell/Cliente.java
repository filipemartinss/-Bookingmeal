package modell;

public class Cliente {

	private String nome;
	private String morada;
	private String email;
	private String telemovel;
	int id;
	
	public Cliente(String nome, String morada, String email, String telemovel, int id) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telemovel = telemovel;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelemovel() {
		return telemovel;
	}

	public void setTelemovel(String telemovel) {
		this.telemovel = telemovel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
