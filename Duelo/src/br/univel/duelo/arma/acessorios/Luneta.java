package br.univel.duelo.arma.acessorios;

import br.univel.duelo.arma.Rifle;

public class Luneta extends Rifle {

	private final Rifle arma;

	public Luneta(final Rifle arma) {
		this.arma = arma;
	}

	@Override
	public Float precisaoTiro() {
		return this.arma.precisaoTiro() * 2F;
	}

}
