package questao2;

public class Torta extends Assado implements Doce {

	private boolean tampa;

	public boolean isTampa() {
		return tampa;
	}

	public void setTampa(boolean tampa) {
		this.tampa = tampa;
	}	
        
        
        public String toString() {
        if( isTampa()){
            return "Torta com tampa e recheio de " + getTipoRecheio();
        }else{
            return "Torta sem tampa e recheio de " + getTipoRecheio();
        }
    }
	

}
