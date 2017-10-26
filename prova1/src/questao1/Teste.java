package questao1;

public class Teste {

	public static void main(String[] args) {
		//Casa A
		Casa c1 = new CasaA();
		for(int i=0;i<c1.getComodos().size();i++){
			c1.getComodo(i).setQuantidadeTomadas(i+1);
		}
		
		for(int i=0;i<c1.getComodos().size();i++){
			if(c1.getComodo(i) instanceof Banheiro){
				((Banheiro ) c1.getComodo(i)).setBide(true);	
			}
			if(c1.getComodo(i) instanceof Sala){
				((Sala ) c1.getComodo(i)).setTipoPiso("ardosia");	
			}
			if(c1.getComodo(i) instanceof Cozinha){
				((Cozinha ) c1.getComodo(i)).setPisoTeto(true);	
			}
			if(c1.getComodo(i) instanceof Quarto){
				((Quarto ) c1.getComodo(i)).setGuardaRoupa(false);
			}
			
		}
		
		
		//Casa B
				Casa c2 = new CasaB();
				for(int i=0;i<c2.getComodos().size();i++){
					c2.getComodo(i).setQuantidadeTomadas(i+3);
				}
				
				((CasaB) c2).setQuantidadeQuintal(500);
				
				for(int i=0;i<c2.getComodos().size();i++){
					if(c2.getComodo(i) instanceof Banheiro){
						((Banheiro ) c2.getComodo(i)).setBide(false);	
					}
					if(c2.getComodo(i) instanceof Sala){
						((Sala ) c2.getComodo(i)).setTipoPiso("pedra");	
					}
					if(c2.getComodo(i) instanceof Cozinha){
						((Cozinha ) c2.getComodo(i)).setPisoTeto(false);	
					}
					if(c2.getComodo(i) instanceof Quarto){
						((Quarto ) c2.getComodo(i)).setGuardaRoupa(true);
					}
					
				}
				
				
				//Casa C
				Casa c3 = new CasaC();
				for(int i=0;i<c3.getComodos().size();i++){
					c3.getComodo(i).setQuantidadeTomadas(i);
				}
				
				((CasaB) c3).setQuantidadeQuintal(1000);
				
				for(int i=0;i<c3.getComodos().size();i++){
					if(c3.getComodo(i) instanceof Banheiro){
						((Banheiro ) c3.getComodo(i)).setBide(false);	
					}
					if(c3.getComodo(i) instanceof Sala){
						((Sala ) c3.getComodo(i)).setTipoPiso("pedra");	
					}
					if(c2.getComodo(i) instanceof Cozinha){
						((Cozinha ) c3.getComodo(i)).setPisoTeto(false);	
					}
					if(c2.getComodo(i) instanceof Quarto){
						((Quarto ) c3.getComodo(i)).setGuardaRoupa(true);
					}
					
				}
				
				
		
		
	}

}
