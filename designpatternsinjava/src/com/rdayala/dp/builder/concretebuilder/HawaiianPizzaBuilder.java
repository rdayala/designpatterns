package com.rdayala.dp.builder.concretebuilder;

import com.rdayala.dp.builder.abstractbuilder.PizzaBuilder;

/* "ConcreteBuilder" */
// Each ConcreteBuilder is responsible for a variant of the product.

public class HawaiianPizzaBuilder extends PizzaBuilder {
	
    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}
