package org.example;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza()
    {
        return pizza;
    }

    public void crearNuevaPizza()
        {
            pizza = new Pizza();
        }

       


    }


