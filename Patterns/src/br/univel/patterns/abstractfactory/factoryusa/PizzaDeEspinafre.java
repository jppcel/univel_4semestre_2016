package br.univel.patterns.abstractfactory.factoryusa;

import br.univel.patterns.abstractfactory.Pizza;
import br.univel.patterns.abstractfactory.TipoPizza;

class PizzaDeEspinafre implements Pizza {

	PizzaDeEspinafre() {
	}

	@Override
	public String getNome() {
		return "Pizza of spinach";
	}

	@Override
	public TipoPizza getTipo() {
		return TipoPizza.LEGUMES;
	}

}
