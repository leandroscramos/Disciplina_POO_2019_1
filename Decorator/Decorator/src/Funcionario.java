public abstract class Funcionario {

    protected String descricao = "Funcionario comum";

    public String descricao() {
        return this.descricao;
    }

    public abstract double getSalario();
}
