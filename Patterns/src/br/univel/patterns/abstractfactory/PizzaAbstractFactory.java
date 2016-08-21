package br.univel.patterns.abstractfactory;

/**
 * Definição de como deve ser criado as fabricas de Pizza, este é uma abstração
 * de Factory, não existe implementação, apenas define como a fabrica se
 * comportará
 * 
 * @author Will
 *
 */
public interface PizzaAbstractFactory {

	public Pizza create(final TipoPizza tipo);
}
