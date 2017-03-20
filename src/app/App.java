package app;

import controler.GestorClientes;
import controler.GestorReservas;
import controler.GestorRestaurante;
public class App {

	public static void main(String[] args){
		
		GestorClientes gc = new GestorClientes();
		GestorRestaurante grest = new GestorRestaurante();
		GestorReservas gr = new GestorReservas();
	}

}
 