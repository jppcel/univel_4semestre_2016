package br.univel.patterns.decorator;

import java.math.BigDecimal;

/**
 * Bebida base para criarmos as nossas combinações
 * 
 * @author wcsantos
 *
 */
public class Cafe implements Bebida {

	@Override
	public String getNome() {
		return "Café";
	}

	@Override
	public BigDecimal getPreco() {
		return BigDecimal.valueOf(3.5);
	}

	@Override
	public Boolean isAlcolica() {
		return false;
	}

}
