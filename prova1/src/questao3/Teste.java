package questao3;

public class Teste {

	//Foi utilizado Padrao AbstractFactory
	public static void main(String[] args) {
		
		//cria algumas Fabricas
		GulaChocolates gula = new GulaChocolates();
		gula.fabricas.add(new ConcreteFabricaBaBom()); //Fabrica apenas Barra e Bombom
		gula.fabricas.add(new ConcreteFabricaBisBo());  //Fabrica apenas Biscoito e Bolacha
		gula.fabricas.add(new ConcreteFabricaBomBis());  //Fabrica apenas Bombom e Biscoito
			

		//Fabrica 1
		BarraDeChocolate ba = ((ConcreteFabricaBaBom)gula.fabricas.get(0)).novoBarra();
		Bombom bom = ((ConcreteFabricaBaBom)gula.fabricas.get(0)).novoBombom();
		ba.setPrecoDeVenda(4);
		ba.setTamanho(1);
		ba.setIngredienteAdicional("castanha");
		
		bom.setPrecoDeVenda(1);
		bom.setQuantidadeChocolate(20);
		bom.setTipoRecheio("doce de leite");
		
		System.out.println("Fabrica 1");
		System.out.println(ba.toString());
		System.out.println();
		System.out.println(bom.toString());
		
		
		//Fabrica 2
		Biscoito bis = ((ConcreteFabricaBisBo)gula.fabricas.get(1)).novoBiscoito();
		Bolacha bo = ((ConcreteFabricaBisBo)gula.fabricas.get(1)).novoBolacha();
		bis.setPrecoDeVenda(50);
		bis.setTipoAroma("forte");
				
		bo.setPrecoDeVenda(2);
		bo.setTipoMassa("trigo");
		bo.setTipoRecheio("chocolate");
		
		System.out.println();
		System.out.println();
		System.out.println("Fabrica 2");
		System.out.println(bis.toString());
		System.out.println();
		System.out.println(bo.toString());
		
		//Fabrica 3
		Biscoito bis2 = ((ConcreteFabricaBomBis)gula.fabricas.get(2)).novoBiscoito();
		Bombom bom2 = ((ConcreteFabricaBomBis)gula.fabricas.get(2)).novoBombom();
		bis2.setPrecoDeVenda(10);
		bis2.setTipoAroma("fraco");
						
		bom2.setPrecoDeVenda(12);
		bom2.setQuantidadeChocolate(14);
		bom2.setTipoRecheio("morango");
		
		System.out.println();
		System.out.println();
		System.out.println("Fabrica 3");
		System.out.println(bis2.toString());
		System.out.println();
		System.out.println(bom2.toString());

		
	}

}
