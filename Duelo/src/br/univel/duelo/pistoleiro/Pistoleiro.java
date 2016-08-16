package br.univel.duelo.pistoleiro;

import br.univel.duelo.arma.Arma;
import br.univel.duelo.arma.ArmaObservador;

public interface Pistoleiro extends ArmaObservador {

	Float atirar();

	Pistoleiro defenderTiro(final Float tiro);

	Boolean estaVivo();

	String getNome();

	Pistoleiro setArma(final Arma arma);
}
