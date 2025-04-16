

public class Chocolate extends PizzaDecorator {

    public Chocolate(Pizza pizza) {
        super(pizza);
    }

    public float getPrecoAdicional() {
        return 8.0f;
    }

    public String getTopping() {
        return "Chocolate";
    }
}