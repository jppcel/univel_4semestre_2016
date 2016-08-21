package br.univel.patterns.abstractfactory.factoryusa;

import br.univel.patterns.abstractfactory.Pizza;
import br.univel.patterns.abstractfactory.PizzaAbstractFactory;
import br.univel.patterns.abstractfactory.TipoPizza;

/**
 * Fabrica concreta de pizza, do tipo brasil, dentro de cada abstract factory
 * temos um factory method
 * 
 * @author Will
 *
 */
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
