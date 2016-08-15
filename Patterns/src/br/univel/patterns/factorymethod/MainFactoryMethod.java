package br.univel.patterns.factorymethod;

public class MainFactoryMethod {

	public static void main(final String[] args) {
		final Pizza pizza = new PizzaFactoryMethod().create("4 Queijos", TipoPizza.QUEIJO);
		System.out.println(String.format("Vamos comer uma pizza de %s", pizza.getTipo()));
	}
}
