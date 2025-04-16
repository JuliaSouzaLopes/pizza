

public class MolhoTomate extends PizzaDecorator {

    public MolhoTomate(Pizza pizza) {
        super(pizza);
    }

    public float getPrecoAdicional() {
        return 2.0f;
    }

    public String getTopping() {
        return "Molho Tomate";
    }
}