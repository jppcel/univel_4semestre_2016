package br.univel.patterns.abstractfactory;

import br.univel.patterns.abstractfactory.factorybrasil.PizzaFactoryBrasil;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-abstract-factory/23030
 * Fornece uma interface para criar familias de objetos relacionados ou dependentes sem especificar suas classes concretas
 * </pre>
 * 
 * @author Will
 *
 */
public class MainAbstractFactory {

	public static void main(final String[] args) {
		// Criar uma pizza de legumes utilizando a fabrica de pizza do brasil
		final Pizza pizza = new PizzaFactoryBrasil().create(TipoPizza.LEGUMES);
		System.out.println(String.format("Vamos comer uma pizza de %s", pizza.getNome()));
	}

}
