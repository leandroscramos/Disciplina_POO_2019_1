import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DiskPizza {

    private static final AtomicInteger count = new AtomicInteger(0);
    private String nome;

    private HashMap<Long, Cliente> clientes = new HashMap<>();

    public DiskPizza(String nome) {
        this.nome = nome;
    }

    public void addCliente(Cliente cliente){
        clientes.put(cliente.getTelefone(), cliente);
    }

    @Override
    public String toString() {
        return "DiskPizza{" +
                "nome = '" + nome + '\'' +
                '}';
    }
}
