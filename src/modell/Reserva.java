package modell;

public class Reserva {

	private String Cliente;
	private String Restaurant;
	private String email;
	private String telemovel;
	int id;
	public Reserva(String cliente, String restaurant, String email, String telemovel, int id) {
		super();
		Cliente = cliente;
		Restaurant = restaurant;
		this.email = email;
		this.telemovel = telemovel;
		this.id = id;
	}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public String getRestaurant() {
		return Restaurant;
	}
	public void setRestaurant(String restaurant) {
		Restaurant = restaurant;
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
