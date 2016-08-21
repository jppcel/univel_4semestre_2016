package br.univel.patterns.abstractfactory.factorybrasil;

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
public class PizzaFactoryBrasil implements PizzaAbstractFactory {

	@Override
	public Pizza create(final TipoPizza tipo) {
		switch (tipo) {
		case LEGUMES:
			return new PizzaDeRucula();
		case PROTEINA:
			return new PizzaDePicanha();
		default:
			throw new RuntimeException("Tipo de Pizza indisponivel");
		}
	}

}
