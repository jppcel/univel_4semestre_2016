package br.univel.patterns.abstractfactory.factoryusa;

import br.univel.patterns.abstractfactory.Pizza;
import br.univel.patterns.abstractfactory.PizzaAbstractFactory;
import br.univel.patterns.abstractfactory.TipoPizza;

public class PizzaFactoryUsa implements PizzaAbstractFactory {

	@Override
	public Pizza create(final TipoPizza tipo) {
		switch (tipo) {
		case LEGUMES:
			return new PizzaDeEspinafre();
		case PROTEINA:
			return new PizzaDeHamburger();
		default:
			throw new RuntimeException("Pizza type unavailable");
		}
	}

}
