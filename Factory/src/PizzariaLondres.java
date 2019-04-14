public class PizzariaLondres  extends Pizzaria{

    public PizzariaLondres() {
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
