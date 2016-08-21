package br.univel.patterns.factorymethod;

/**
 * {@link PizzaDeCalabresa} é uma das pizzas disponíveis no nosso sistema
 */
class PizzaDeCalabresa implements Pizza {

	private final String nome;

	PizzaDeCalabresa(final String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	public TipoPizza getTipo() {
		return TipoPizza.CALABRESA;
	}

}
