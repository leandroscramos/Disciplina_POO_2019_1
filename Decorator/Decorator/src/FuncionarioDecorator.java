public abstract class FuncionarioDecorator extends Funcionario{

    public Funcionario funcionario;

    public abstract String descricao();

    public abstract double getSalario();
}
