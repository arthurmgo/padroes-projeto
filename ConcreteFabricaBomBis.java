package questao3;

public class ConcreteFabricaBomBis implements FabricaAbstratoBomBis{

	private static ConcreteFabricaBomBis instancia = new ConcreteFabricaBomBis();
    
	public static ConcreteFabricaBomBis getInstancia(){
		return instancia;
	}
	
	public Bombom novoBombom() {
		return new Bombom();
		
	}

	public Biscoito novoBiscoito() {
		return new Biscoito();
		
	} 
	
	
}
