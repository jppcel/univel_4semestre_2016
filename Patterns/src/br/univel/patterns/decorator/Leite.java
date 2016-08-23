package br.univel.patterns.decorator;

import java.math.BigDecimal;

public class Leite implements Bebida {

	private final Bebida bebida;

	public Leite(final Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getNome() {
		return String.format("%s com leite ", this.bebida.getNome());
	}

	@Override
	public BigDecimal getPreco() {
		return this.bebida.getPreco().add(BigDecimal.valueOf(0.5));
	}

	@Override
	public Boolean isAlcolica() {
		return this.bebida.isAlcolica() || false;
	}

}
