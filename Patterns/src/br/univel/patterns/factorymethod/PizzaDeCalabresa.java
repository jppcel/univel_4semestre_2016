package br.univel.patterns.factorymethod;

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
