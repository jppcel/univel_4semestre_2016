package br.univel.patterns.builder.complexobject.bebida;

import br.univel.patterns.builder.complexobject.embalagem.Embalagem;

public class Garrafa implements Embalagem {

	@Override
	public String tipo() {
		return "Garrafa";
	}
}