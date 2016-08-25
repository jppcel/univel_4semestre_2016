package br.univel.patterns.decorator;

import java.math.BigDecimal;





public class NullBebida implements Bebida {

	@Override
	public String getNome() {
		return "";
	}

	@Override
	public BigDecimal getPreco() {
		return BigDecimal.ZERO;
	}

	@Override
	public Boolean isAlcolica() {
		return false;
	}

}
