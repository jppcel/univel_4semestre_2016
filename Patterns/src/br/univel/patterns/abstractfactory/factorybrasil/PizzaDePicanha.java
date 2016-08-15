package br.univel.patterns.abstractfactory.factorybrasil;

import br.univel.patterns.abstractfactory.Pizza;
import br.univel.patterns.abstractfactory.TipoPizza;

class PizzaDePicanha implements Pizza {

	PizzaDePicanha() {
	}

	@Override
	public String getNome() {
		return "Picanha ao ponto";
	}

	@Override
	public TipoPizza getTipo() {
		return TipoPizza.PROTEINA;
	}

}
