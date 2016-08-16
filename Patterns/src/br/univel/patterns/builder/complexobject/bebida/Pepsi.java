package br.univel.patterns.builder.complexobject.bebida;

public class Pepsi extends BebidaGelada {

	@Override
	public Float getPreco() {
		return 3.50f;
	}

	@Override
	public String getNome() {
		return "Pepsi";
	}
}