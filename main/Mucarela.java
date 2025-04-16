

public class Mucarela extends PizzaDecorator {

    public Mucarela(Pizza pizza) {
        super(pizza);
    }

    public float getPrecoAdicional() {
        return 2.0f;
    }

    public String getTopping() {
        return "Muçarela";
    }
}