package br.univel.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import br.univel.patterns.facade.exceptions.ComputadorError;
import br.univel.patterns.facade.exceptions.ComputadorException;
import br.univel.patterns.facade.exceptions.CpuError;

public class ComputadorFacade {

	private final Computador computador;

	public ComputadorFacade(final Computador computador) {
		this.computador = computador;
	}

	public void ligar() {
		List<ComputadorError> erros = new ArrayList<>();
		if (!this.computador.iniciarCPU()) {
			erros.add(new CpuError());
		}
		this.computador.iniciarMemoria();
		this.computador.iniciarDisco();
		this.computador.iniciarSO();
		this.computador.acenderMonitor();
		if (erros.size() > 0) {
			throw new ComputadorException(erros);
		}
	}
}
