package br.univel.duelo.pistoleiro.usa;

import java.util.Random;

import br.univel.duelo.pistoleiro.Pistoleiro;

/**
 * Fora da lei americano
 * 
 * @author Will
 *
 */
class Forasteiro implements Pistoleiro {

	private final String nome;
	private float vida = 80;

	protected Forasteiro(final String nome) {
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
	public Forasteiro defenderTiro(final Float tiro) {
		this.vida -= tiro;
		return this;
	}

	@Override
	public Boolean estaVivo() {
		return vida > 0;
	}

}
