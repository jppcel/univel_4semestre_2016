package br.univel.duelo.policial;

import br.univel.duelo.arma.Arma;

public class RoboCop implements Policial {

	@Override
	public void prender() {
		System.out.println("RoboCop não prende ninguém, apenas mata criminosos");
	}

	@Override
	public Float agredir() {
		return 100F;
	}

	@Override
	public Float atirar() {
		return 150F;
	}

	@Override
	public void apanhar(Float soco) {
		System.out.println("RoboCop não apanha, nunca, extendo a classe Chuck Norris");
	}

	@Override
	public void defenderTiro(Float tiro) {
		System.out.println("Não defendo tiro, sou do tipo Chuck Norris");
	}

	@Override
	public void setArma(Arma arma) {
		System.out.println("RoboCop não precisa receber arma, RoboCop já tem a sua");
	}

}
