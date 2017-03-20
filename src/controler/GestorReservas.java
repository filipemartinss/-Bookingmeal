package controler;

import java.util.ArrayList;

import modell.Reserva;

public class GestorReservas {


		ArrayList < Reserva > arReserva;

	 
		public  GestorReservas() {
		 
			this.arReserva = new ArrayList<Reserva>();
		 
	 }
	 
		public void addReserva(String cliente, String restaurant, String email, String telemovel, int id){
				Reserva r = new Reserva  (cliente,restaurant,email,telemovel, id);
				int novoId = arReserva.size();
		 
				r.setId(novoId);
				arReserva.add(r);	  
	}

		public void addCliente(Reserva r){
			int novoId = arReserva.size();
			r.setId(novoId);
		 
			arReserva.add(r);
	}
		public Reserva getCliente(int id){
			for (Reserva r : arReserva){
				if(r.getId() == id)
					return r;
		}
		return null;
		
		}
	}
	