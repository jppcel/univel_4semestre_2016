package br.univel.patterns.factorymethod;

class PizzaDeCalabresa extends AbstractPizza implements Pizza {

	PizzaDeCalabresa(String nome) {
		super(nome);
	}

	public TipoPizza getTipo() {
		return TipoPizza.CALABRESA;
	}

}
