package br.univel.duelo.pistoleiro.usa;

import br.univel.duelo.pistoleiro.AbstractPistoleiro;
import br.univel.duelo.pistoleiro.Pistoleiro;

class Forasteiro extends AbstractPistoleiro implements Pistoleiro {

	protected Forasteiro(final String nome) {
		super(nome, 70F, 7F);
	}

}
