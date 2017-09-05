package com.rdayala.dp.builder.concretebuilder;

import com.rdayala.dp.builder.abstractbuilder.PizzaBuilder;

/* "ConcreteBuilder" */
// Each ConcreteBuilder is responsible for a variant of the product.

public class SpicyPizzaBuilder extends PizzaBuilder {
	
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
