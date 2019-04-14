public class Cafe extends Bebida {

    boolean b;

    public Cafe() {
    }

    public Cafe(Boolean b){
        this.b = b;
    }

    @Override
    public void misturar() {
        System.out.println("Misturando o café");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Café com açúcar");
    }

    @Override
    public boolean clienteQuerCondimento() {
        return b;
    }
}
