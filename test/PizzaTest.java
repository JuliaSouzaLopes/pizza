

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarPrecoMassa () {
        Pizza pizza = new MassaPizza(6.0f);
        assertEquals(6.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassa () {
        Pizza pizza = new MassaPizza(6.0f);
        assertEquals("Massa", getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolho () {
        Pizza pizza = new MolhoTomate(new MassaPizza(6.0f));
        assertEquals(8.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolho () {
        Pizza pizza = new MolhoTomate(new MassaPizza(6.0f));
        assertEquals("Massa/Molho Tomate", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolhoMucarela () {
        Pizza pizza = new Mucarela (new MolhoTomate(new MassaPizza(6.0f)));
        assertEquals(10.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolhoMucarela () {
        Pizza pizza = new Mucarela(new MolhoTomate(new MassaPizza(6.0f)));
        assertEquals("Massa/Molho Tomate/Muçarela", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolhoMucarelaCalabresa () {
        Pizza pizza = new Calabresa (new Mucarela (new MolhoTomate(new MassaPizza(6.0f))));
        assertEquals(20.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolhoMucarelaCalabresa () {
        Pizza pizza = new Calabresa(new Mucarela(new MolhoTomate(new MassaPizza(6.0f))));
        assertEquals("Massa/Molho Tomate/Muçarela/Calabresa", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolhoMucarelaPortuguesa () {
        Pizza pizza = new Portuguesa (new Mucarela (new MolhoTomate(new MassaPizza(6.0f))));
        assertEquals(25.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolhoMucarelaPortuguesa () {
        Pizza pizza = new Portuguesa(new Mucarela(new MolhoTomate(new MassaPizza(6.0f))));
        assertEquals("Massa/Molho Tomate/Muçarela/Portuguesa", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaMolhoMucarelaQuatroQueijos () {
        Pizza pizza = new QuatroQueijos (new Mucarela (new MolhoTomate(new MassaPizza(6.0f))));
        assertEquals(22.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaMolhoMucarelaQuatroQueijos () {
        Pizza pizza = new QuatroQueijos(new Mucarela(new MolhoTomate(new MassaPizza(6.0f))));
        assertEquals("Massa/Molho Tomate/Muçarela/Quatro Queijos", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaChocolate() {
        Pizza pizza = new Chocolate(new MassaPizza(6.0f));
        assertEquals(14.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaChocolate () {
        Pizza pizza = new Chocolate(new MassaPizza(6.0f));
        assertEquals("Massa/Chocolate", pizza.getSabor());
    }

    @Test
    void deveRetornarPrecoMassaChocolateMorango () {
        Pizza pizza = new Morango (new Chocolate(new MassaPizza(6.0f)));
        assertEquals(19.0f, pizza.getPreco());
    }

    @Test
    void deveRetornarSaborMassaChocolateMorango () {
        Pizza pizza = new Morango(new Chocolate(new MassaPizza(6.0f)));
        assertEquals("Massa/Chocolate/Morango", pizza.getSabor());
    }

}