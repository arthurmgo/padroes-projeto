package questao3;

public class ConcreteFabricaBisBo implements FabricaAbstratoBisBo{
	

	public Biscoito novoBiscoito() {
		return new Biscoito();
		
	}

	public Bolacha novoBolacha() {
		return new Bolacha();
		
	} 

}
