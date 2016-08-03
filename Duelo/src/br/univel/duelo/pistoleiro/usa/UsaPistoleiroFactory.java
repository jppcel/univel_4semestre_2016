package br.univel.duelo.pistoleiro.usa;

import br.univel.duelo.pistoleiro.Pistoleiro;
import br.univel.duelo.pistoleiro.PistoleiroFactory;
import br.univel.duelo.pistoleiro.TipoPistoleiro;

public class UsaPistoleiroFactory implements PistoleiroFactory {

	@Override
	public Pistoleiro create(TipoPistoleiro tipo, String nome) {
		switch (tipo) {
		case DENTRO_DA_LEI:
			return new Cherife(nome);
		case FORA_DA_LEI:
			return new Forasteiro(nome);
		default:
			throw new RuntimeException("Tipo de pistoleiro não encontrado");
		}
	}

}
