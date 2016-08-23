package br.univel.patterns.decorator;

import java.math.BigDecimal;
import java.util.Objects;

public class Creme implements Bebida {

	private final Bebida bebida;

	public Creme(final Bebida bebida) {
		Objects.requireNonNull(bebida, "Bebida não pode ser null");
		this.bebida = bebida;
	}

	@Override
	public String getNome() {
		return String.format("%s com creme", this.bebida.getNome());
	}

	@Override
	public BigDecimal getPreco() {
		BigDecimal valorCreme = BigDecimal.ONE;
		return this.bebida.getPreco().add(valorCreme);
	}

	@Override
	public Boolean isAlcolica() {
		return this.bebida.isAlcolica() || false;
	}

}
