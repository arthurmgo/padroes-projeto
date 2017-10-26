package questao3;

public class ConcreteFabricaBaBom implements FabricaAbstratoBaBom {
	

	public BarraDeChocolate novoBarra() {
		return new BarraDeChocolate();
	}

	public Bombom novoBombom() {
		return new Bombom();
	}

	
}
