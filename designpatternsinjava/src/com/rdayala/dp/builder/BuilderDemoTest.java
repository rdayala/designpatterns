package com.rdayala.dp.builder;

import com.rdayala.dp.builder.abstractbuilder.PizzaBuilder;
import com.rdayala.dp.builder.concretebuilder.HawaiianPizzaBuilder;
import com.rdayala.dp.builder.concretebuilder.SpicyPizzaBuilder;
import com.rdayala.dp.builder.director.Waiter;
import com.rdayala.dp.builder.product.Pizza;

/* A customer ordering a pizza. */
// Client code using Builder pattern to build complex product i.e, Pizza

public class BuilderDemoTest {

	public static void main(String[] args) {

		// Creating Builder class
        PizzaBuilder pizzabuilder = new HawaiianPizzaBuilder();
        
		// Creating Director class
		Waiter waiter = new Waiter();		

        // Director class holds a reference to the builder
        waiter.setPizzaBuilder( pizzabuilder );
        
        // Construct the complex product
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
        
        /* Construct a different product */
        
        pizzabuilder = new SpicyPizzaBuilder();
        
        // Director class holds a reference to the builder
        waiter.setPizzaBuilder( pizzabuilder );
        
        // Construct the complex product
        waiter.constructPizza();

        pizza = waiter.getPizza();
        System.out.println(pizza);
        
        
	}

}
