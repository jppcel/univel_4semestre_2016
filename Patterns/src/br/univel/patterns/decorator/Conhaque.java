package br.univel.patterns.decorator;

import java.math.BigDecimal;

public class Conhaque implements Bebida {

	private final Bebida bebida;

	public Conhaque(final Bebida bebida) {
		this.bebida = bebida;
	}

	@Override
	public String getNome() {
		return String.format("%s com conhaque ", this.bebida.getNome());
	}

	@Override
	public BigDecimal getPreco() {
		return this.bebida.getPreco().add(BigDecimal.valueOf(1.5));
	}

	@Override
	public Boolean isAlcolica() {
		return this.bebida.isAlcolica() || true;
	}

}
