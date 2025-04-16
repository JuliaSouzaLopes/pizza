

public class Calabresa extends PizzaDecorator {

    public Calabresa(Pizza pizza) {
        super(pizza);
    }

    public float getPrecoAdicional() {
        return 10.0f;
    }

    public String getTopping() {
        return "Calabresa";
    }
}