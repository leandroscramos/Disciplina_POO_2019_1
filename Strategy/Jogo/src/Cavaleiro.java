public class Cavaleiro extends Personagem {

    public Cavaleiro(ComportamentoArma c) {
        super(c);
    }

    @Override
    public void realizarAtaque() {
        c.usarArma();
    }
}
