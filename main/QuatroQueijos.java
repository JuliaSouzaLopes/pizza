

public class QuatroQueijos extends PizzaDecorator {

    public QuatroQueijos(Pizza pizza) {
        super(pizza);
    }

    public float getPrecoAdicional() {
        return 12.0f;
    }

    public String getTopping() {
        return "Quatro Queijos
        ";
    }
}