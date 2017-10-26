package questao1;

public class CasaA extends Casa {

    public CasaA() {
        comodos.add(new Sala());
        comodos.add(new Banheiro());
        comodos.add(new Cozinha());
        comodos.add(new Quarto());
        comodos.add(new Quarto());
    }

    @Override
    public String toString() {
        return "Casa do tipo A\n" + super.toString(); 
    }
    
    
}
