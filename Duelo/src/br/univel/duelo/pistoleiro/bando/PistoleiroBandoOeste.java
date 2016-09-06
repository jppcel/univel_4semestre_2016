package br.univel.duelo.pistoleiro.bando;

import java.util.ArrayList;
import java.util.List;

import br.univel.duelo.arma.Arma;
import br.univel.duelo.pistoleiro.Pistoleiro;

public class PistoleiroBandoOeste implements PistoleiroBando {

	private final String nome;
	private List<Pistoleiro> pistoleiros = new ArrayList<>();
	
	public PistoleiroBandoOeste(final String nome) {
		this.nome = nome;
	}
	
	@Override
	public Float atirar() {
		Float tiro = 0F;
		for (final Pistoleiro pistoleiro : pistoleiros) {
			tiro += pistoleiro.atirar();
		}
		return tiro;
	}

	@Override
	public Pistoleiro defenderTiro(final Float tiro) {
		final Float divisao = tiro / this.pistoleiros.size();
		this.pistoleiros.forEach(
				pistoleiro -> pistoleiro.defenderTiro(divisao));
		return this;
	}

	@Override
	public Boolean estaVivo() {
		Boolean vivo = false;
		for (final Pistoleiro pistoleiro : pistoleiros) {
			vivo |= pistoleiro.estaVivo();
		}
		return vivo;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public Pistoleiro setArma(final Arma arma) {
		return this;
	}

	@Override
	public void armaAtualizada(Arma arma) {
	}

	@Override
	public PistoleiroBando adicionarIntegrante(
			final Pistoleiro pistoleiro) {
		this.pistoleiros.add(pistoleiro);
		return this;
	}

}
