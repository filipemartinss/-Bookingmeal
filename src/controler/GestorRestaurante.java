package controler;

import java.util.ArrayList;

import modell.Restaurante;

public class GestorRestaurante {

	ArrayList < Restaurante > arRestaurante;

	 
	public  GestorRestaurante() {
	 
		this.arRestaurante = new ArrayList<Restaurante>();
	 
 }
 
	public void addRestaurante(String nome, String morada, String especialidade, int id){
		Restaurante res = new Restaurante  (nome,morada,especialidade, id);
			int novoId = arRestaurante.size();
	 
			res.setId(novoId);
			arRestaurante.add(res);	  
}

	public void addCliente(Restaurante res){
		int novoId = arRestaurante.size();
		res.setId(novoId);
	 
		arRestaurante.add(res);
}
	public Restaurante getCliente(int id){
		for (Restaurante res : arRestaurante){
			if(res.getId() == id)
				return res;
	}
	return null;
	
	}
	
}
