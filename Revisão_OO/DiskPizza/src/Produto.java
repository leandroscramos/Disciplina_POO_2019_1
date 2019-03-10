public abstract class Produto {

    private Integer numero;
    private String nome;
    private Double preco;

    public Produto(Integer numero, String nome, Double preco) {
        this.numero = numero;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getPreco();

    @Override
    public String toString() {
        return "Produto{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
