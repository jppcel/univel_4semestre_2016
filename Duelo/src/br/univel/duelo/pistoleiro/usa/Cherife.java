package br.univel.duelo.pistoleiro.usa;

import java.util.Random;

import br.univel.duelo.pistoleiro.Pistoleiro;

/**
 * Pistoleiro dentro da lei americano
 * 
 * @author Will
 *
 */
class Cherife implements Pistoleiro {

	private final String nome;
	private float vida = 100;

	protected Cherife(final String nome) {
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
	public Cherife defenderTiro(final Float tiro) {
		this.vida -= tiro;
		return this;
	}

	@Override
	public Boolean estaVivo() {
		return this.vida > 0;
	}

}
