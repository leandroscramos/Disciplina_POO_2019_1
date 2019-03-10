public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private Long telefone;

    public Cliente(String nome, String endereco, String cpf, Long telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                " nome = '" + nome + '\'' +
                ", endereco = '" + endereco + '\'' +
                ", cpf = " + cpf +
                ", telefone = " + telefone +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}

