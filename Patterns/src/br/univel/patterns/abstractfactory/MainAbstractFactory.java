package br.univel.patterns.abstractfactory;

import br.univel.patterns.abstractfactory.pizza.Pizza;
import br.univel.patterns.abstractfactory.pizza.PizzaAbstractFactory;
import br.univel.patterns.abstractfactory.pizza.TipoPizza;

public class MainAbstractFactory {

	public static void main(final String[] args) {
	}

	public void produzirPizza(final PizzaAbstractFactory pizzaFactory) {
		final Pizza pizza = pizzaFactory.create("Queijo", TipoPizza.QUEIJO);
		System.out.println(String.format("Vamos comer uma pizza de %s", pizza.getTipo()));
	}
}
