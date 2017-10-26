package questao3;


public class ConcreteFabricaBaBom implements FabricaAbstratoBaBom {
	
	private static ConcreteFabricaBaBom instancia = new ConcreteFabricaBaBom();
	                                                  
	public static ConcreteFabricaBaBom getInstancia(){
		return instancia;
	}

	public BarraDeChocolate novoBarra() {
		return new BarraDeChocolate();
	}

	public Bombom novoBombom() {
		return new Bombom();
	}

	
}
