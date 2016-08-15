package br.univel.patterns.abstractfactory;

import br.univel.patterns.abstractfactory.factorybrasil.PizzaFactoryBrasil;

public class MainAbstractFactory {

	public static void main(final String[] args) {
		final Pizza pizza = new PizzaFactoryBrasil().create(TipoPizza.LEGUMES);
		System.out.println(String.format("Vamos comer uma pizza de %s", pizza.getNome()));
	}

}
