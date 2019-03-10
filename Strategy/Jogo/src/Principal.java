public class Principal {
    public static void main(String[] args) {

        Personagem rei = new Rei(new Espada());
        rei.realizarAtaque();

        System.out.println("");
        rei.setC(new ArcoFlecha());
        rei.realizarAtaque();


        System.out.println("");
        System.out.println("---");
        System.out.println("");

        Personagem duende = new Duende(new Machado());
        duende.realizarAtaque();

        System.out.println("");
        duende.setC(new Espada());
        duende.realizarAtaque();


        System.out.println("");
        System.out.println("---");
        System.out.println("");

        Personagem cavaleiro = new Cavaleiro(new ArcoFlecha());
        cavaleiro.realizarAtaque();

        System.out.println("");
        cavaleiro.setC(new Machado());
        cavaleiro.realizarAtaque();


    }
}
