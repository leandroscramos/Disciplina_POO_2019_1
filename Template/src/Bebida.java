public abstract class Bebida {

    final void prepararReceita(){
        ferverAgua();
        misturar();
        colocarNaXicara();
        if (clienteQuerCondimento()){
            adicionarCondimentos();
        }
    }

    public abstract void misturar();
    public abstract void adicionarCondimentos();

    public void ferverAgua() {
        System.out.println("Fervendo água");
    }

    public void colocarNaXicara(){
        System.out.println("Colocando na xícara");
    }

    public boolean clienteQuerCondimento() {
        return false;
    }
}
