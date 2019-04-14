public class PizzaMussarelaEstiloRoma extends Pizza {

    protected String nome = "Pizza de Mussarela - Estilo Roma";

    @Override
    public void getNome() {
        System.out.println("nome = " + nome);
    }

}
