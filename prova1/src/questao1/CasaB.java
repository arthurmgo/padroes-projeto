package questao1;

public class CasaB extends Casa {

    private int quantidadeQuintal;

    public CasaB() {
        comodos.add(new Sala());
        comodos.add(new Banheiro());
        comodos.add(new Banheiro());
        comodos.add(new Cozinha());
        comodos.add(new Quarto());
        comodos.add(new Quarto());
        comodos.add(new Quarto());
    }

    public int getQuantidadeQuintal() {
        return quantidadeQuintal;
    }

    public void setQuantidadeQuintal(int quantidadeQuintal) {
        this.quantidadeQuintal = quantidadeQuintal;
    }

    @Override
    public String toString() {
        return "Casa do tipo B com "+ getQuantidadeQuintal()+ " metros quadrados de quintal \n" + super.toString();
    }

}
