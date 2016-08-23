package br.univel.patterns.decorator;

import java.math.BigDecimal;

public class Cafe implements Bebida {

	@Override
	public String getNome() {
		return "Caf�";
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
