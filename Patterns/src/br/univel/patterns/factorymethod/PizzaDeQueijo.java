package br.univel.patterns.factorymethod;

class PizzaDeQueijo extends AbstractPizza implements Pizza {

	PizzaDeQueijo(String nome) {
		super(nome);
	}

	public TipoPizza getTipo() {
		return TipoPizza.QUEIJO;
	}

}
