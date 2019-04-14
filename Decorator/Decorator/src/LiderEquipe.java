public class LiderEquipe extends FuncionarioDecorator{

    public LiderEquipe(Funcionario f) {
        this.funcionario = f;
    }

    public String descricao(){
        return funcionario.descricao() + " e Lider de equipe";
    }

    public double getSalario(){
        return funcionario.getSalario() + 300.00;
    }
}
