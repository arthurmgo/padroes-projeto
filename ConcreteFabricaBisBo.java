package questao3;

public class ConcreteFabricaBisBo implements FabricaAbstratoBisBo{
	
	
	private static ConcreteFabricaBisBo instancia = new ConcreteFabricaBisBo();
    
	public static ConcreteFabricaBisBo getInstancia(){
		return instancia;
	}

	public Biscoito novoBiscoito() {
		return new Biscoito();
		
	}

	public Bolacha novoBolacha() {
		return new Bolacha();
		
	} 

}
