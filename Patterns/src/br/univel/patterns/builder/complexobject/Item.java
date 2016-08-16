package br.univel.patterns.builder.complexobject;

import br.univel.patterns.builder.complexobject.embalagem.Embalagem;

public interface Item {
	public String getNome();

	public Embalagem getEmbagalem();

	public Float getPreco();
}