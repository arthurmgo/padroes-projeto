package questao1;

public class Cozinha extends Comodo {

    private boolean pisoTeto;

    public boolean isPisoTeto() {
        return pisoTeto;
    }

    public void setPisoTeto(boolean pisoTeto) {
        this.pisoTeto = pisoTeto;
    }

    @Override
    public String toString() {
        if (isPisoTeto()) {
            return "Cozinha com piso até o teto e " + getQuantidadeTomadas() + " tomadas";
        } else {
            return "Cozinha sem piso até o teto e " + getQuantidadeTomadas() + " tomadas";
        }
    }

}
