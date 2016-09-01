package br.univel.patterns.example.facade;

import br.univel.patterns.example.computadores.Computador;
import br.univel.patterns.example.computadores.ComputadorFactory;
import br.univel.patterns.example.computadores.TipoComputador;

public class ComputadorFacadeBuilder {

	private ComputadorFactory factory;
	private TipoComputador tipo;

	public ComputadorFactory getFactory() {
		return factory;
	}

	public ComputadorFacadeBuilder setFactory(ComputadorFactory factory) {
		this.factory = factory;
		return this;
	}

	public TipoComputador getTipo() {
		return tipo;
	}

	public ComputadorFacadeBuilder setTipo(TipoComputador tipo) {
		this.tipo = tipo;
		return this;
	}

	public ComputadorFacade build() {
		final Computador comp = this.factory.create(tipo);
		return new ComputadorFacade(comp);
	}

}
