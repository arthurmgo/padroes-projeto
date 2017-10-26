package questao3;

public class BarraDeChocolate extends Produto {

	private int tamanho;
	private String ingredienteAdicional;
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getIngredienteAdicional() {
		return ingredienteAdicional;
	}
	public void setIngredienteAdicional(String ingredienteAdicional) {
		this.ingredienteAdicional = ingredienteAdicional;
	}
		
	
	public String toString(){
		return "tamanho: "+ tamanho +"\n"+"ingredienteAdicional: "+ingredienteAdicional+"\n"+
	"precoDeVenda: "+super.getPrecoDeVenda();
		
	}

}
