package modell;

public class Restaurante {

	private String nome;
	private String morada;
	private String especialidade;
	int id;
	public Restaurante(String nome, String morada, String especialidade, int id) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.especialidade = especialidade;
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
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	


}
