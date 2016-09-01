package br.univel.patterns.example.facade;

import br.univel.patterns.example.computadores.Computador;

public class ComputadorFacade {

	private ComputadorFacadeObserver observer;
	private final Computador computador;

	public ComputadorFacade(final Computador computador) {
		this.computador = computador;
	}

	public ComputadorFacade registerObserver(final ComputadorFacadeObserver observer) {
		this.observer = observer;
		return this;
	}

	public void ligar() {
		this.computador.iniciarCPU();
		this.observer.cpuIniciada();
		this.computador.iniciarMemoria();
		this.observer.memoriaIniciada();
		this.computador.iniciarDisco();
		this.observer.discoIniciada();
		this.computador.iniciarSO();
		this.observer.soIniciada();
		this.computador.iniciarMonitor();
		this.observer.monitorIniciada();
	}
}
