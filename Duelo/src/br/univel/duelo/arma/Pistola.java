package br.univel.duelo.arma;

import java.util.ArrayList;
import java.util.List;

public class Pistola implements Arma {

	private Integer municoes = 0;
	private final List<ArmaObservador> observadores = new ArrayList<>();

	public void adicionarObservador(final ArmaObservador observador) {
		this.observadores.add(observador);
	}

	protected void notificaObservadores() {
		this.observadores.forEach(
				observador -> observador.armaAtualizada(this));
	}

	@Override
	public Float atirar() {
		Float tiro = 0F;
		if (temMunicoes()) {
			this.municoes--;
			tiro = potenciaTiro() * precisaoTiro();
		}else{
			System.out.println("Arma sem municao, recarregue");
		}
		notificaObservadores();
		return tiro;
	}

	@Override
	public Float potenciaTiro() {
		return 7F;
	}

	@Override
	public Float precisaoTiro() {
		return 5F;
	}

	@Override
	public Arma recarregar(Integer municoes) {
		this.municoes += municoes;
		notificaObservadores();
		return this;
	}

	@Override
	public Boolean temMunicoes() {
		return this.municoes > 0;
	}

}
