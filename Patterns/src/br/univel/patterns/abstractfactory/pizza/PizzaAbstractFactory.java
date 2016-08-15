package br.univel.patterns.abstractfactory.pizza;

public interface PizzaAbstractFactory {

	public Pizza create(final String nome, final TipoPizza tipo);
}
