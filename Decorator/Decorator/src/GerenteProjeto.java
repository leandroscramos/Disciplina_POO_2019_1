public class GerenteProjeto extends FuncionarioDecorator{

    public GerenteProjeto(Funcionario f) {

        this.funcionario = f;
    }

    public String descricao(){

        return funcionario.descricao() + " e Gerente de projeto";
    }

    public double getSalario(){

        return funcionario.getSalario() + 1000.00;
    }
}
