package br.univel.duelo.policial;

import br.univel.duelo.arma.Arma;
import br.univel.duelo.pistoleiro.Pistoleiro;

public class PistoleiroAdapter implements Pistoleiro {

	private final Policial policial;
	
	public PistoleiroAdapter(final Policial policial) {
		this.policial = policial;
	}
	
	@Override
	public void armaAtualizada(Arma arma) {
		System.out.println("Policial não observa a sua arma");
	}

	@Override
	public Float atirar() {
		return this.policial.atirar();
	}

	@Override
	public Pistoleiro defenderTiro(Float tiro) {
		this.policial.defenderTiro(tiro);
		return this;
	}

	@Override
	public Boolean estaVivo() {
		System.out.println("Sou puliça, não morro nunca");
		return true;
	}

	@Override
	public String getNome() {
		return "Puliça";
	}

	@Override
	public Pistoleiro setArma(Arma arma) {
		System.out.println("Puliça já sai da academia com arma");
		return this;
	}

}
