package br.univel.patterns.factorymethod;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-factory-method-em-java/26348
 * O padrão Factory Method por sua vez encapsula a criação de objetos, no entanto, a diferença é que neste padrão encapsula-se a criação de objetos deixando as subclasses decidirem quais objetos criar.
 * </pre>
 * 
 * @author Will
 *
 */
public class MainFactoryMethod {

	public static void main(final String[] args) {
		// Cria uma pizza de 4 queijos, porém o PizzaFactoryMethod, é quem
		// decide qual a instancia de pizza que será criada, pois 4 Queijos é o
		// tipo de pizza
		final Pizza pizza = new PizzaFactoryMethod().create("4 Queijos", TipoPizza.QUEIJO);
		System.out.println(String.format("Vamos comer uma pizza de %s", pizza.getTipo()));
	}
}
