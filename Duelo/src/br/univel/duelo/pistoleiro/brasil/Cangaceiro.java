package br.univel.duelo.pistoleiro.brasil;

import br.univel.duelo.pistoleiro.AbstractPistoleiro;
import br.univel.duelo.pistoleiro.Pistoleiro;

/**
 * Cangaceiro é o pistoleiro fora da lei do Brasil, já tem a o seu nivel de vida
 * reduzido devido conflitos anteriores
 * 
 * @author Will
 *
 */
class Cangaceiro extends AbstractPistoleiro implements Pistoleiro {

	protected Cangaceiro(final String nome) {
		super(nome, 80F, 5F);
	}

}
