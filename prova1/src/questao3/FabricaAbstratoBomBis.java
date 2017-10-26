package questao3;

public interface FabricaAbstratoBomBis <Bom extends Bombom,Bis extends Biscoito> extends Fabrica{

		public Bom novoBombom();
	    public Bis novoBiscoito();


}
