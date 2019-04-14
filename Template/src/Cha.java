public class Cha extends Bebida {

    boolean b;

    public Cha() {
    }

    public Cha(Boolean b){
        this.b = b;
    }

    @Override
    public void misturar() {
        System.out.println("Misturando o chá");
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Chá com limão");
    }

    @Override
    public boolean clienteQuerCondimento() {
        return b;
    }
}
