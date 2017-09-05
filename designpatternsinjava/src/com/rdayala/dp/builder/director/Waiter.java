package com.rdayala.dp.builder.director;

import com.rdayala.dp.builder.abstractbuilder.PizzaBuilder;
import com.rdayala.dp.builder.product.Pizza;

/* "Director class" */
// Director holds a reference to a Builder. 
// Director directs,i.e. is responsible for, creation of the product using the interface provided to it by Builder


public class Waiter {
	
	// Director class holds a reference to the Builder class.
	private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    // Construct method is to create the complex product
    // using one of the Concrete builder
    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

}
