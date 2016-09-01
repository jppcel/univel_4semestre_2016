package br.univel.patterns.example;

import br.univel.patterns.example.computadores.ComputadorFactory;
import br.univel.patterns.example.computadores.TipoComputador;
import br.univel.patterns.example.exceptions.ComputadorException;
import br.univel.patterns.example.facade.ComputadorFacade;
import br.univel.patterns.example.facade.ComputadorFacadeBuilder;
import br.univel.patterns.example.facade.ComputadorFacadeObserver;

public class Tela1 implements ComputadorFacadeObserver {

	public static void main(final String[] args) {
		new Tela1().executeActions();
	}

	public void executeActions() {
		try {
			ComputadorFacadeBuilder builder = new ComputadorFacadeBuilder();
			builder.setTipo(TipoComputador.LAPTOP)
			.setFactory(new ComputadorFactory());
			ComputadorFacade facade = builder.build();
			facade.registerObserver(this);
			facade.ligar();
			System.out.println("Computador operando normalmente");
		} catch (final ComputadorException e) {
			System.err.println("Problemas ao iniciar o computador");
			e.printStackTrace();
		}
	}

	@Override
	public void cpuIniciada() {
		System.out.println("CPU OK");
	}

	@Override
	public void memoriaIniciada() {
		System.out.println("Memoria OK");
	}

	@Override
	public void discoIniciada() {
		System.out.println("Disco OK");
	}

	@Override
	public void soIniciada() {
		System.out.println("SO OK");
	}

	@Override
	public void monitorIniciada() {
		System.out.println("Monitor OK");
	}
}
