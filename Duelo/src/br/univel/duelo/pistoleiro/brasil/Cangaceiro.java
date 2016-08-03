package br.univel.duelo.pistoleiro.brasil;

import java.util.Random;

import br.univel.duelo.pistoleiro.Pistoleiro;

/**
 * Cangaceiro é o pistoleiro fora da lei do Brasil, já tem a o seu nivel de vida
 * reduzido devido conflitos anteriores
 * 
 * @author Will
 *
 */
class Cangaceiro implements Pistoleiro {

	private final String nome;
	private float vida = 80;

	protected Cangaceiro(final String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public Float atirar() {
		return new Random().nextFloat() * 80;
	}

	@Override
	public Cangaceiro defenderTiro(final Float tiro) {
		this.vida -= tiro;
		return this;
	}

	@Override
	public Boolean estaVivo() {
		return this.vida > 0;
	}

}
