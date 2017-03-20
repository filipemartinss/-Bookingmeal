package controler;

import java.util.ArrayList;

import modell.Cliente;
import modell.BookingMeal;
import modell.Restaurante;

public class GestorClientes {

	ArrayList < Cliente > arCliente;

 
	public GestorClientes() {
	 
		this.arCliente = new ArrayList<Cliente>();
	 
 }
 
	public void addCliente(String nome, String morada, String email, String telemovel, int id){
			Cliente c = new Cliente  (nome, morada,email,telemovel, id);
			int novoId = arCliente.size();
	 
			c.setId(novoId);
			arCliente.add(c);	  
}

	public void addCliente(Cliente c){
		int novoId = arCliente.size();
		c.setId(novoId);
	 
		arCliente.add(c);
}
	public Cliente getCliente(int id){
		for (Cliente c : arCliente){
			if(c.getId() == id)
				return c;
	}
	return null;
	
	}
	
}



