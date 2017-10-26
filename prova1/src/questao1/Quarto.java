package questao1;

public class Quarto extends Comodo {

    private boolean GuardaRoupa;

    public boolean isGuardaRoupa() {
        return GuardaRoupa;
    }

    public void setGuardaRoupa(boolean guardaRoupa) {
        GuardaRoupa = guardaRoupa;
    }

    @Override
    public String toString() {
        if (isGuardaRoupa()) {
            return "Quarto com Guarda-Roupas e " + getQuantidadeTomadas() + " tomadas";
        } else {
            return "Quarto sem Guarda-Roupas e " + getQuantidadeTomadas() + " tomadas";
        }
    }

}
