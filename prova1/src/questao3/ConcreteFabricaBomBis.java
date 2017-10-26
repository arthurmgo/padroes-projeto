package questao3;

public class ConcreteFabricaBomBis implements FabricaAbstratoBomBis{

	public Bombom novoBombom() {
		return new Bombom();
		
	}

	public Biscoito novoBiscoito() {
		return new Biscoito();
		
	} 
	
	
}
