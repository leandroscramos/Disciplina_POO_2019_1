public class Bebida extends Produto{

    private String tipo;

    public Bebida(Integer numero, String nome, Double preco, String tipo) {
        super(numero, nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "numero = '" + getNumero() +
                "', nome = '" + getNome() +
                "', preco = " + getPreco()  +
                '}';
    }

    @Override
    public double getPreco(){
        return 0;
    }
}
