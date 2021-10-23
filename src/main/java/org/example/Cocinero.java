package org.example;

public class Cocinero {
    private PizzaBuilder pizzaBuilder;
    public void setPizzaBuilder(PizzaBuilder pb)
    {
        pizzaBuilder = pb;
    }

    public Pizza getPizza()
    {
        return pizzaBuilder.getPizza();
    }

   

}
