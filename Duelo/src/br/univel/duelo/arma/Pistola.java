package br.univel.duelo.arma;

public class Pistola implements Arma {

	private Integer municoes = 0;

	@Override
	public Float atirar() {
		if (temMunicoes()) {
			this.municoes--;
			return potenciaTiro() * precisaoTiro();
		}
		System.out.println("Arma sem municao, regarregue");
		return 0F;
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
		return this;
	}

	@Override
	public Boolean temMunicoes() {
		return this.municoes > 0;
	}

}
