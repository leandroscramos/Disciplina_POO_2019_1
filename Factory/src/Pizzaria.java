public abstract class Pizzaria {

    abstract public Pizza criaPizza(String tipo);

    public Pizza realizaPedido(String tipo){
        Pizza pizza = criaPizza(tipo);

        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.empacotar();

        return pizza;

    }

}
