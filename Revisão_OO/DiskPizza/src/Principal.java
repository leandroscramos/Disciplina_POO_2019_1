public class Principal {
    public static void main(String[] args) {

        DiskPizza pizzaria = new DiskPizza("Leandro's Pizzaria");
        System.out.println(pizzaria);
        System.out.println();

        Cliente leandro = new Cliente("Leandro", "Rua Leandro", "12345678", (long) 12345678 );
        Cliente kaleo = new Cliente("Kaleo", "Rua Kaleo", "34567891", (long) 12345678 );
        Cliente felipe = new Cliente("Felipe", "Rua Felipe", "67891234", (long) 12345678 );

        pizzaria.addCliente(leandro);
        pizzaria.addCliente(kaleo);
        pizzaria.addCliente(felipe);

        System.out.println(leandro);
        System.out.println(kaleo);
        System.out.println(felipe);
        System.out.println();

        Ingrediente queijo = new Ingrediente("Queijo", 2.00);
        Ingrediente presunto = new Ingrediente("Presunto", 4.00);
        Ingrediente tomate = new Ingrediente("Tomate", 1.00);

        System.out.println(queijo);
        System.out.println(presunto);
        System.out.println(tomate);
        System.out.println();

        Pizza mista = new Pizza(01, "Mista", 25.00, queijo, presunto, tomate);
        Pizza mussarela = new Pizza(02, "Mussarela", 35.00, queijo, tomate);
        System.out.println(mista);
        System.out.println(mussarela);
        System.out.println();

        Bebida coca = new Bebida(01, "Coca", 5.00, "refrigerante");
        Bebida suco = new Bebida(02, "Suco", 7.00, "Suco");
        System.out.println(coca);
        System.out.println(suco);
        System.out.println();

    }
}
