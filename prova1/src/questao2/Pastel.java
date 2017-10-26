package questao2;

public class Pastel extends Frito implements Salgado {

    private boolean requeijao;

    public boolean isRequeijao() {
        return requeijao;
    }

    public void setRequeijao(boolean requeijao) {
        this.requeijao = requeijao;
    }

    @Override
    public String toString() {
        if (isRequeijao()) {
            return "Pastel com requeijao e recheio de " + getTipoRecheio();
        } else {
            return "Pastel sem requeijao e recheio de " + getTipoRecheio();
        }

    }
}
