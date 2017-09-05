package com.rdayala.dp.builder.abstractbuilder;

import com.rdayala.dp.builder.product.Pizza;

/* "Abstract Builder" */
// Builder is the base class which all the ConcreteBuilder instances extend.

public abstract class PizzaBuilder {
	
    protected Pizza pizza;

    // the getXXX() method is provided to fetch the final assembled product.
    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
