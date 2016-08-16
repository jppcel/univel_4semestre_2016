package br.univel.patterns.builder.complexobject.hamburger;

import br.univel.patterns.builder.complexobject.Item;
import br.univel.patterns.builder.complexobject.embalagem.Caixa;
import br.univel.patterns.builder.complexobject.embalagem.Embalagem;

public abstract class Hamburger implements Item {

	@Override
	public Embalagem getEmbagalem() {
		return new Caixa();
	}

	@Override
	public abstract Float getPreco();
}