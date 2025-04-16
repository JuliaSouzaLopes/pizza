

public class Portuguesa extends PizzaDecorator {

    public Portuguesa(Pizza pizza) {
        super(pizza);
    }

    public float getPrecoAdicional() {
        return 15.0f;
    }

    public String getTopping() {
        return "Portuguesa";
    }
}