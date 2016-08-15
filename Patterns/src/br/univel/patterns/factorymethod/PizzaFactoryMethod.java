package br.univel.patterns.factorymethod;

public class PizzaFactoryMethod {

	public Pizza create(final String nome, final TipoPizza tipo) {
		switch (tipo) {
		case QUEIJO:
			return new PizzaDeQueijo(nome);
		case CALABRESA:
			return new PizzaDeCalabresa(nome);
		default:
			throw new RuntimeException("Tipo de pizza não disponivel");
		}
	}
}
