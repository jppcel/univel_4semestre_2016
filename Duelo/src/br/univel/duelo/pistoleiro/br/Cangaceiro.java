package br.univel.duelo.pistoleiro.br;

import br.univel.duelo.pistoleiro.AbstractPistoleiro;
import br.univel.duelo.pistoleiro.Pistoleiro;

class Cangaceiro extends AbstractPistoleiro implements Pistoleiro {

	protected Cangaceiro(final String nome) {
		super(nome, 80F, 4F);
	}

}
