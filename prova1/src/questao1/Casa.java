package questao1;

import java.util.ArrayList;

public class Casa {
	
	ArrayList <Comodo> comodos = new ArrayList<Comodo>();

	public ArrayList<Comodo> getComodos() {
		return comodos;
	}
	
	public Comodo getComodo(int id){
		if(comodos.size() > id){
			return comodos.get(id);
		}else{
			return null;
		}
	}
	
	
}
