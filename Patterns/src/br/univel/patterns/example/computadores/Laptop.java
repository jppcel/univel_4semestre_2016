package br.univel.patterns.example.computadores;

import br.univel.patterns.example.exceptions.CPUException;
import br.univel.patterns.example.exceptions.MonitorException;

class Laptop implements Computador{

	@Override
	public void iniciarCPU() {
		throw new CPUException();
	}

	@Override
	public void iniciarMemoria() {
		System.out.println("Memoria iniciada");
	}

	@Override
	public void iniciarDisco() {
		System.out.println("Disco iniciado");
	}

	@Override
	public void iniciarSO() {
		System.out.println("SO iniciada");		
	}

	@Override
	public void iniciarMonitor() {
		throw new MonitorException();
	}

}
