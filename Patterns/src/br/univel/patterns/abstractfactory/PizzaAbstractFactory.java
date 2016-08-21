package br.univel.patterns.abstractfactory;

/**
 * Defini��o de como deve ser criado as fabricas de Pizza, este � uma abstra��o
 * de Factory, n�o existe implementa��o, apenas define como a fabrica se
 * comportar�
 * 
 * @author Will
 *
 */
public interface PizzaAbstractFactory {

	public Pizza create(final TipoPizza tipo);
}
