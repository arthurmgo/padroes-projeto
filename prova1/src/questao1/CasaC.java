package questao1;

public class CasaC extends Casa{

private int quantidadeQuintal;
private int quantidadeJardim;
	
	public CasaC(){
    	comodos.add(new Sala());
    	comodos.add(new Banheiro());
    	comodos.add(new Banheiro());
    	comodos.add(new Banheiro());
    	comodos.add(new Cozinha());
    	comodos.add(new Copa());
    	comodos.add(new Quarto());
    	comodos.add(new Quarto());  	
    	comodos.add(new Quarto());  
    }

	public int getQuantidadeQuintal() {
		return quantidadeQuintal;
	}

	public void setQuantidadeQuintal(int quantidadeQuintal) {
		this.quantidadeQuintal = quantidadeQuintal;
	}

	public int getQuantidadeJardim() {
		return quantidadeJardim;
	}

	public void setQuantidadeJardim(int quantidadeJardim) {
		this.quantidadeJardim = quantidadeJardim;
	}
	
	

}
