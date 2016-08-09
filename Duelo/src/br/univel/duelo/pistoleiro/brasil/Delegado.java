package br.univel.duelo.pistoleiro.brasil;

import br.univel.duelo.pistoleiro.AbstractPistoleiro;
import br.univel.duelo.pistoleiro.Pistoleiro;

/**
 * Delegado é o pistoleiro dentro da lei no Brasil, cuida para que tudo fique ok
 * 
 * @author Will
 *
 */
class Delegado extends AbstractPistoleiro implements Pistoleiro {

	protected Delegado(final String nome) {
		super(nome, 100F, 7F);
	}

}
