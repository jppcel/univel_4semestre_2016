package br.univel.patterns.abstractfactory.factorybrasil;

import br.univel.patterns.abstractfactory.Pizza;
import br.univel.patterns.abstractfactory.PizzaAbstractFactory;
import br.univel.patterns.abstractfactory.TipoPizza;

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
