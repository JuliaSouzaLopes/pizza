

public class Morango extends PizzaDecorator {

    public Morango(Pizza pizza) {
        super(pizza);
    }

    public float getPrecoAdicional() {
        return 5.0f;
    }

    public String getTopping() {
        return "Morango";
    }
}