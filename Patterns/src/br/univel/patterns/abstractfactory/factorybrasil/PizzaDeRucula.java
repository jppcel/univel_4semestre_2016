package br.univel.patterns.abstractfactory.factorybrasil;

import br.univel.patterns.abstractfactory.Pizza;
import br.univel.patterns.abstractfactory.TipoPizza;

class PizzaDeRucula implements Pizza {

	public PizzaDeRucula() {
	}

	@Override
	public String getNome() {
		return "Rucula";
	}

	@Override
	public TipoPizza getTipo() {
		return TipoPizza.LEGUMES;
	}

}
