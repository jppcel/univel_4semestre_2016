package br.univel.patterns.factorymethod;

/**
 * Factory para {@link Pizza}, define qual a implementa��o ser� utilizada
 * baseada no tipo de pizza que o cliente pede
 * 
 * @author Will
 *
 */
public class PizzaFactoryMethod {

	/**
	 * Factory para {@link Pizza}, define qual a implementa��o ser� utilizada
	 * baseada no tipo de pizza que o cliente pede
	 * 
	 * @param nome
	 * @param tipo
	 * @return
	 */
	public Pizza create(final String nome, final TipoPizza tipo) {
		switch (tipo) {
		case QUEIJO:
			return new PizzaDeQueijo(nome);
		case CALABRESA:
			return new PizzaDeCalabresa(nome);
		default:
			throw new RuntimeException("Tipo de pizza n�o disponivel");
		}
	}
}
