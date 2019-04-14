public class PizzariaRoma extends Pizzaria{

    public PizzariaRoma() {
    }

    @Override
    public Pizza criaPizza(String tipo) {

        if (tipo.equals("mussarela")){
            return new PizzaMussarelaEstiloRoma();
        } else if (tipo.equals("calabresa")){
            return new PizzaCalabresaEstiloRoma();
        }
    }
}
