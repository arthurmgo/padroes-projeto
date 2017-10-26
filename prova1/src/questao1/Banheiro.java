package questao1;

public class Banheiro extends Comodo {

    private boolean bide;

    public boolean isBide() {
        return bide;
    }

    public void setBide(boolean bide) {
        this.bide = bide;
    }

    @Override
    public String toString() {
        if (isBide()) {
            return "Banheiro com Bide e " + getQuantidadeTomadas() + " tomadas";
        } else {
            return "Banheiro sem Bide e " + getQuantidadeTomadas() + " tomadas";
        }
    }

}
