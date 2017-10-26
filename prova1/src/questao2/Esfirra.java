package questao2;

public class Esfirra extends Assado implements Salgado {

	private Boolean aberta;

	public Boolean isAberta() {
		return aberta;
	}

	public void setAberta(Boolean aberta) {
		this.aberta = aberta;
	}

    @Override
    public String toString() {
        if( isAberta()){
            return "Esfirra aberta com recheio de " + getTipoRecheio();
        }else{
            return "Esfirra fechada com recheio de "  + getTipoRecheio();
        }
    }
	
	

}
