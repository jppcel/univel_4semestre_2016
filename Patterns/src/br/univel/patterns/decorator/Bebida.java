package br.univel.patterns.decorator;

import java.math.BigDecimal;

/**
 * Denifição de bebida no exemplo
 * @author wcsantos
 *
 */
public interface Bebida {

	String getNome();

	BigDecimal getPreco();

	Boolean isAlcolica();
}
