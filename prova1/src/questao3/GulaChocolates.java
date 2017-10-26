package questao3;

import java.util.ArrayList;

//Padrao Abstract Factory

public class GulaChocolates {

	ArrayList <Fabrica> fabricas = new ArrayList<Fabrica>();

	public ArrayList<Fabrica> getFabricas() {
		return fabricas;
	}

	public Fabrica getFabrica(int id){
		if(fabricas.size()>id){
			return fabricas.get(id);
		}else
			return null;
		
	}

}
