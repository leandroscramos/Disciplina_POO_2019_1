public class Pato {

    private ComportamentoVoar v;
    private ComportamentoGrasnar g;

    public Pato (ComportamentoVoar v, ComportamentoGrasnar g){
        this.v = v;
        this.g = g;
    }

    public void nadar(){
        System.out.println("O pato está nadando...");
    }

    public void display(){
        System.out.println("O pato está na tela...");
    }

    public void realizaGrasnar(){
        g.grasnar();
    }

    public void realizaVoar(){
        v.voar();
    }

    public void setGrasnar(ComportamentoGrasnar g){
        this.g = g;
    }

    public void setVoar(ComportamentoVoar v){
        this.v = v;
    }

}
