public class Rei extends Personagem{

    public Rei(ComportamentoArma c) {
        super(c);
    }

    @Override
    public void realizarAtaque() {
        c.usarArma();
    }

}
