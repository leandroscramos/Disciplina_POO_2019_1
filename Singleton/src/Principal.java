public class Principal {
    public static void main(String[] args) {

        MyLogSingleTon.getInstance().log("Erro de Warning", "Warning");
        MyLogSingleTon.getInstance().log("Erro de Information", "Information");
        MyLogSingleTon.getInstance().log("Erro", "Error");
    }
}
