public class Duende extends Personagem {

    public Duende(ComportamentoArma c) {
        super(c);
    }

    @Override
    public void realizarAtaque() {
        c.usarArma();
    }
}
