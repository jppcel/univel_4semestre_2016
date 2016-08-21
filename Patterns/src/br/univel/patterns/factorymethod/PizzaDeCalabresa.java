package br.univel.patterns.factorymethod;

/**
 * {@link PizzaDeCalabresa} � uma das pizzas dispon�veis no nosso sistema
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
