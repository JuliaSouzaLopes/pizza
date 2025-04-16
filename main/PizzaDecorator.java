

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public String sabor;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract float getPrecoAdicional();

    public float getPreco() {
        return this.pizza.getPreco() + this.getPrecoAdicional();
    }

    public abstract String getTopping();

    public String getSabor() {
        return this.pizza.getSabor() + "/" + this.getTopping();
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}