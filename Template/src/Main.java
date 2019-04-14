public class Main {

    public static void main(String[] args) {

        Bebida cafe = new Cafe(true);
        cafe.prepararReceita();

        System.out.println("---------------");

        Bebida cha = new Cha();
        cha.prepararReceita();

    }
}
