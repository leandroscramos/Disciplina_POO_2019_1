public class Principal {

    public static void main(String[] args) {

        Pato p1 = new Pato (new VoarComAsas(), new Grasnar());
        p1.nadar();
        p1.display();
        p1.realizaGrasnar();
        p1.realizaVoar();

        System.out.println("");

        p1.setGrasnar(new GrasnarMudo());
        p1.setVoar(new NaoVoar());
        p1.realizaGrasnar();
        p1.realizaVoar();

    }
}
