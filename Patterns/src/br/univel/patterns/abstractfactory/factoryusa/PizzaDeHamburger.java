package br.univel.patterns.abstractfactory.factoryusa;

import br.univel.patterns.abstractfactory.Pizza;
import br.univel.patterns.abstractfactory.TipoPizza;

class PizzaDeHamburger implements Pizza {

	@Override
	public String getNome() {
		return "Pizza of hamburger";
	}

	@Override
	public TipoPizza getTipo() {
		return TipoPizza.PROTEINA;
	}

}
