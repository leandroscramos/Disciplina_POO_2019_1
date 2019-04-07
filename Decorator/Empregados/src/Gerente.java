public class Gerente extends Empregado{

    protected Empregado gerente;

    public Gerente(Empregado gerente){
        this.gerente = gerente;
    }

    @Override
    public Double getSalario() {
        return null;
    }

    @Override
    public String getDescricao() {
        return null;
    }
}
