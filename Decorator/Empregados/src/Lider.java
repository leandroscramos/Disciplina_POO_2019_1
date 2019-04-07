public class Lider extends Empregado{

    protected Empregado lider;

    public Lider(Empregado lider){
        this.lider = lider;
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
