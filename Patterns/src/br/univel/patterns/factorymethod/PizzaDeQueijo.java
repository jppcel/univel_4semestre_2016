package br.univel.patterns.factorymethod;

/**
 * {@link PizzaDeQueijo} � uma das pizzas dispon�veis no nosso sistema
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
