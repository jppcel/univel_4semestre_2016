package br.univel.duelo.pistoleiro.br;

import br.univel.duelo.pistoleiro.AbstractPistoleiro;
import br.univel.duelo.pistoleiro.Pistoleiro;

class Delegado extends AbstractPistoleiro implements Pistoleiro {

	protected Delegado(final String nome) {
		super(nome, 100F, 7F);
	}
}
