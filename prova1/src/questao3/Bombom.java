package questao3;

public class Bombom extends Produto{

	private int quantidadeChocolate;
    private String tipoRecheio;
    
	public int getQuantidadeChocolate() {
		return quantidadeChocolate;
	}
	public void setQuantidadeChocolate(int quantidadeChocolate) {
		this.quantidadeChocolate = quantidadeChocolate;
	}
	public String getTipoRecheio() {
		return tipoRecheio;
	}
	public void setTipoRecheio(String tipoRecheio) {
		this.tipoRecheio = tipoRecheio;
	}
    
	public String toString(){
		return "quantidadedeChocolate: "+ quantidadeChocolate + "\n"+"TipoRecheio: "+tipoRecheio+"\n"+
	"precoDeVenda: "+super.getPrecoDeVenda();
		
	}
    
}
