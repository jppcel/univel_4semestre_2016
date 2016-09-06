package br.univel.duelo.pistoleiro.bando;

import br.univel.duelo.pistoleiro.PistoleiroFactory;
import br.univel.duelo.pistoleiro.TipoPistoleiro;

public class BandoFactory implements PistoleiroFactory {

	@Override
	public PistoleiroBando create(
			final TipoPistoleiro tipo, final String nome) {
		return new PistoleiroBandoOeste(nome);
	}

}
