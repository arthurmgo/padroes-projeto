package questao3;

public interface FabricaAbstratoBisBo <Bi extends Biscoito,Bo extends Bolacha> extends Fabrica{

	public Bi novoBiscoito();
	public Bo novoBolacha();
	
	
}
