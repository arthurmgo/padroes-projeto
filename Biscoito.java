package questao3;

public class Biscoito extends Produto{

	private String tipoAroma;

	public String getTipoAroma() {
		return tipoAroma;
	}

	public void setTipoAroma(String tipoAroma) {
		this.tipoAroma = tipoAroma;
	}
	
	
	public String toString(){
		return "Biscoito\n"+"tipoAroma: "+tipoAroma+"\n"+
	"precoDeVenda: "+super.getPrecoDeVenda();
		
	}
	
}
