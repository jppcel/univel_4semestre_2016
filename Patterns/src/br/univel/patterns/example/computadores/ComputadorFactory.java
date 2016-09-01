package br.univel.patterns.example.computadores;

public class ComputadorFactory {

	public Computador create(final TipoComputador tipo){
		switch (tipo) {
		case DESKTOP:
			return new Desktop();
		case LAPTOP:
			return new Laptop();
		default:
			throw new RuntimeException("Tipo não disponivel nesta fabrica");
		}
	}
}
