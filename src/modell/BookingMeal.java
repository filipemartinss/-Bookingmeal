package modell;

public class BookingMeal {

	private int ClinteId;
	private int Restauranteid;
	private int Reservaid;
	private int DateTime;
	private int qtPessoas;
	public BookingMeal(int clinteId, int restauranteid, int reservaid, int dateTime, int qtPessoas) {
		super();
		ClinteId = clinteId;
		Restauranteid = restauranteid;
		Reservaid = reservaid;
		DateTime = dateTime;
		this.qtPessoas = qtPessoas;
	}
	public int getClinteId() {
		return ClinteId;
	}
	public void setClinteId(int clinteId) {
		ClinteId = clinteId;
	}
	public int getRestauranteid() {
		return Restauranteid;
	}
	public void setRestauranteid(int restauranteid) {
		Restauranteid = restauranteid;
	}
	public int getReservaid() {
		return Reservaid;
	}
	public void setReservaid(int reservaid) {
		Reservaid = reservaid;
	}
	public int getDateTime() {
		return DateTime;
	}
	public void setDateTime(int dateTime) {
		DateTime = dateTime;
	}
	public int getQtPessoas() {
		return qtPessoas;
	}
	public void setQtPessoas(int qtPessoas) {
		this.qtPessoas = qtPessoas;
	}
	
	
		
	
}
