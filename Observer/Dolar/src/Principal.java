public class Principal {
    public static void main(String[] args) {

        ValorDolar valorDolar = new ValorDolar();

        Jornal jornal = new Jornal();
        Internet internet = new Internet();

        valorDolar.registerObserver(jornal);
        valorDolar.registerObserver(internet);

        valorDolar.setMudancaValor(3.45, "10 50");

        System.out.println("");
        valorDolar.removeObserver(internet);
        valorDolar.setMudancaValor(2.80, "11 20");

        System.out.println("");
        valorDolar.removeObserver(jornal);
        valorDolar.setMudancaValor(4.00, "12 30");

        System.out.println("");
        valorDolar.registerObserver(jornal);
        valorDolar.registerObserver(internet);
        valorDolar.setMudancaValor(1.50, "13 30");



    }
}
