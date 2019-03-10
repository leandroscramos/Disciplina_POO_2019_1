public abstract class Personagem {

    protected ComportamentoArma c;

    public Personagem(ComportamentoArma c) {
        this.c = c;
    }

    abstract void realizarAtaque();

    public void setC(ComportamentoArma c) {
        this.c = c;
    }

    public ComportamentoArma getC() {
        return c;
    }
}
