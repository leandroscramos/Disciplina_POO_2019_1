import java.util.HashMap;

public class Pizza extends Produto{

    private HashMap<String, Ingrediente> ingredientes = new HashMap<>();

    public Pizza(Integer numero, String nome, Double preco, Ingrediente... ingredientes) {
        super(numero, nome, preco);
        for (Ingrediente i: ingredientes) {
            this.ingredientes.put(i.getNome(),i);
        }
    }

    public void addIngrediente (Ingrediente ingrediente){
        ingredientes.put(ingrediente.getNome(), ingrediente);
    }

    public void rmIngrediente(String chave){
        ingredientes.remove(chave);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "numero = '" + getNumero() +
                "', nome = '" + getNome() +
                "', preco = " + getPreco() +
                ", ingredientes = " + ingredientes +
                '}';
    }

    @Override
    public double getPreco(){
        return 0;
    }

}
