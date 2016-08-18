package br.univel.duelo.pistoleiro;

public enum Precisao {

	OTIMA(10F), BOA(7F), REGULAR(5F), MEDIA(3F), RUIM(1F);

	private final Float value;

	private Precisao(final Float value) {
		this.value = value;
	}

	public Float getValue() {
		return value;
	}
}
