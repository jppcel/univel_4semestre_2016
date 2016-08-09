package br.univel.duelo.pistoleiro.usa;

import br.univel.duelo.pistoleiro.AbstractPistoleiro;
import br.univel.duelo.pistoleiro.Pistoleiro;

/**
 * Representa um pistoleiro no nosso joguinho com as ações básicas deste, sendo
 * atirar e defender tiro
 * 
 * @author Will
 *
 */
class Cherife extends AbstractPistoleiro implements Pistoleiro {

	protected Cherife(final String nome) {
		super(nome, 100F, 7F);
	}

}
