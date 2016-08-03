package br.univel.duelo.pistoleiro.brasil;

import java.util.Random;

import br.univel.duelo.pistoleiro.Pistoleiro;

/**
 * Delegado é o pistoleiro dentro da lei no Brasil, cuida para que tudo fique ok
 * 
 * @author Will
 *
 */
class Delegado implements Pistoleiro {

	private final String nome;
	private float vida = 100;

	protected Delegado(final String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public Float atirar() {
		return new Random().nextFloat() * 100;
	}

	@Override
	public Delegado defenderTiro(final Float tiro) {
		this.vida -= tiro;
		return this;
	}

	@Override
	public Boolean estaVivo() {
		return this.vida > 0;
	}

}
