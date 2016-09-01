package br.univel.patterns.facade;

public class ComputadorFacade {

	private final Computador computador;

	public ComputadorFacade(final Computador computador) {
		this.computador = computador;
	}

	public void ligar() {
		this.computador.iniciarMemoria();
		this.computador.iniciarDisco();
		this.computador.iniciarSO();
		this.computador.acenderMonitor();
	}
}
