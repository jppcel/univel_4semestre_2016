package br.univel.patterns.abstractfactory.brfactory;

import br.univel.patterns.abstractfactory.pizza.Pizza;
import br.univel.patterns.abstractfactory.pizza.PizzaAbstractFactory;
import br.univel.patterns.abstractfactory.pizza.TipoPizza;

public class BrPizzaFactory implements PizzaAbstractFactory {

	@Override
	public Pizza create(String nome, TipoPizza tipo) {
		return null;
	}

}
