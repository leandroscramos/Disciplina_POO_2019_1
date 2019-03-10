import java.util.HashMap;

public class AgenciaFacade {

    private AgenciaAluguelCarro agenciaAluguelCarro;
    private AgenciaPassagem agenciaPassagem;
    private AgenciaHospedagem agenciaHospedagem;
    private AgenciaTuristica agenciaTuristica;
    private AgenciaTransfer agenciaTransfer;

    HashMap<Integer, Cotacao> cotacoes = new HashMap();

    public AgenciaFacade(){
        agenciaAluguelCarro = new AgenciaAluguelCarro();
        agenciaPassagem = new AgenciaPassagem();
        agenciaHospedagem = new AgenciaHospedagem();
        agenciaTuristica = new AgenciaTuristica();
        agenciaTransfer = new AgenciaTransfer();
    }

    public double cotarPassagem
}
