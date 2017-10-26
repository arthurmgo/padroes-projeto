package questao3;

public class Bolacha extends Produto{

	private String tipoMassa;
	private String tipoRecheio;
	public String getTipoMassa() {
		return tipoMassa;
	}
	public void setTipoMassa(String tipoMassa) {
		this.tipoMassa = tipoMassa;
	}
	public String getTipoRecheio() {
		return tipoRecheio;
	}
	public void setTipoRecheio(String tipoRecheio) {
		this.tipoRecheio = tipoRecheio;
	}
	
	public String toString(){
		return "tipoMassa: "+tipoMassa+"\n"+"tipoRecheio: "+tipoRecheio+"\n"+
	"precoDeVenda: "+super.getPrecoDeVenda();
		
	}

}
