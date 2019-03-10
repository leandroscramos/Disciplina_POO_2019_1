public class Cotacao {

    private int id;
    private double agenciaAluguelCarro;
    private double agenciaPassagem;
    private double agenciaHospedagem;
    private double agenciaTuristica;
    private double agenciaTransfer;

    public double getValorCotacao(){
        return agenciaAluguelCarro + agenciaHospedagem + agenciaPassagem + agenciaTransfer + agenciaTuristica;
    }

    public double getAgenciaAluguelCarro() {
        return agenciaAluguelCarro;
    }

    public void setAgenciaAluguelCarro(double agenciaAluguelCarro) {
        this.agenciaAluguelCarro = agenciaAluguelCarro;
    }

    public double getAgenciaPassagem() {
        return agenciaPassagem;
    }

    public void setAgenciaPassagem(double agenciaPassagem) {
        this.agenciaPassagem = agenciaPassagem;
    }

    public double getAgenciaHospedagem() {
        return agenciaHospedagem;
    }

    public void setAgenciaHospedagem(double agenciaHospedagem) {
        this.agenciaHospedagem = agenciaHospedagem;
    }

    public double getAgenciaTuristica() {
        return agenciaTuristica;
    }

    public void setAgenciaTuristica(double agenciaTuristica) {
        this.agenciaTuristica = agenciaTuristica;
    }

    public double getAgenciaTransfer() {
        return agenciaTransfer;
    }

    public void setAgenciaTransfer(double agenciaTransfer) {
        this.agenciaTransfer = agenciaTransfer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
