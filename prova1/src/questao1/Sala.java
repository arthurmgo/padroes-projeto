package questao1;

public class Sala extends Comodo {

    private String tipoPiso;

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    @Override
    public String toString() {
        return "Sala com piso de " + getTipoPiso() + " e " + getQuantidadeTomadas() + " tomadas";

    }

}
