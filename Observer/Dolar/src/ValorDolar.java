import java.util.ArrayList;

public class ValorDolar implements Subject {

    private ArrayList<Observer> obs = new ArrayList<Observer>();
    private Double valor;
    private String horario;

    @Override
    public void registerObserver(Observer o) {
        obs.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        obs.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : obs)
            o.update(valor, horario);
    }

    public void setMudancaValor(Double valor, String horario){
        this.valor = valor;
        this.horario = horario;
        notifyObservers();
    }
}
