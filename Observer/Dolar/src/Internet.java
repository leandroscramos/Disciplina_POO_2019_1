import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Internet implements Observer {

    private Double valor;
    private String horario;

    @Override
    public void update(Double d, String s) {
        this.valor = d;
        this.horario = s;
        publicar();
    }

    public void publicar(){
        System.out.println("Internet de " + DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDateTime.now()));
        System.out.println("Valor do Dolar = " + valor);
        System.out.println("Horario = " + horario);
    }
}
