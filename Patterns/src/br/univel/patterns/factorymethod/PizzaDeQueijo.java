package br.univel.patterns.factorymethod;

/**
 * {@link PizzaDeQueijo} é uma das pizzas disponíveis no nosso sistema
 */
class PizzaDeQueijo implements Pizza {

	private final String nome;

	PizzaDeQueijo(final String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	public TipoPizza getTipo() {
		return TipoPizza.QUEIJO;
	}

}
