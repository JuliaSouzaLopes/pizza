

public class MassaPizza implements Pizza {

    public float preco;

    public MassaPizza() {}

    public MassaPizza (float preco) {
        this.preco = preco;
    }

    public float getPreco (){
        return preco;
    }

    public String getSabor () {
        return "Massa";
    }

}