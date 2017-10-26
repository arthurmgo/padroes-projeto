package questao3;

public interface FabricaAbstratoBaBom <Ba extends BarraDeChocolate,Bo extends Bombom> extends Fabrica{

	public Ba novoBarra();
	public Bo novoBombom();
	

}
