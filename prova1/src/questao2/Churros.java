package questao2;

public class Churros extends Frito implements Doce{

	private String cobertura;

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

    @Override
    public String toString() {
        return "Churros de " + getTipoRecheio() + " com cobertura de " + getCobertura();
    }
        
        
	
	

}
