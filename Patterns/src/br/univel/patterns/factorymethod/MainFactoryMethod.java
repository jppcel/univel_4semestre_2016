package br.univel.patterns.factorymethod;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-factory-method-em-java/26348
 * O padr�o Factory Method por sua vez encapsula a cria��o de objetos, no entanto, a diferen�a � que neste padr�o encapsula-se a cria��o de objetos deixando as subclasses decidirem quais objetos criar.
 * </pre>
 * 
 * @author Will
 *
 */
public class MainFactoryMethod {

	public static void main(final String[] args) {
		// Cria uma pizza de 4 queijos, por�m o PizzaFactoryMethod, � quem
		// decide qual a instancia de pizza que ser� criada, pois 4 Queijos � o
		// tipo de pizza
		final Pizza pizza = new PizzaFactoryMethod().create("4 Queijos", TipoPizza.QUEIJO);
		System.out.println(String.format("Vamos comer uma pizza de %s", pizza.getTipo()));
	}
}
