package br.univel.patterns.builder.complexobject.bebida;

import br.univel.patterns.builder.complexobject.Item;
import br.univel.patterns.builder.complexobject.embalagem.Embalagem;

public abstract class BebidaGelada implements Item {

	@Override
	public Embalagem getEmbagalem() {
		return new Garrafa();
	}

	@Override
	public abstract Float getPreco();
}