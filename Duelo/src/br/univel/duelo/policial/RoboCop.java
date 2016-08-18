package br.univel.duelo.policial;

import br.univel.duelo.arma.Arma;

public class RoboCop implements Policial {

	@Override
	public void prender() {
		System.out.println("RoboCop n�o prende ningu�m, apenas mata criminosos");
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
		System.out.println("RoboCop n�o apanha, nunca, extendo a classe Chuck Norris");
	}

	@Override
	public void defenderTiro(Float tiro) {
		System.out.println("N�o defendo tiro, sou do tipo Chuck Norris");
	}

	@Override
	public void setArma(Arma arma) {
		System.out.println("RoboCop n�o precisa receber arma, RoboCop j� tem a sua");
	}

}
