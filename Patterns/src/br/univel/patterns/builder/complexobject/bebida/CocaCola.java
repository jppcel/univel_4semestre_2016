package br.univel.patterns.builder.complexobject.bebida;

public class CocaCola extends BebidaGelada {

	@Override
	public Float getPreco() {
		return 3.0f;
	}

	@Override
	public String getNome() {
		return "Coca-Cola";
	}
}