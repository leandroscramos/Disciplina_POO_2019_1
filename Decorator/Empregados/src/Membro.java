public class Membro extends Empregado{

    protected Empregado membro;

    public Membro(Empregado membro){
        this.membro = membro;
    }

    @Override
    public Double getSalario() {
        System.out.println(1000.00);
        return 0.0;
    }

    @Override
    public String getDescricao() {
        return null;
    }
}
