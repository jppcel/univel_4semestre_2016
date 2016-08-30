package br.univel.patterns.facade;

public interface Computador {

	Boolean iniciarCPU();
	
	Boolean iniciarMemoria();
	
	Boolean iniciarDisco();
	
	Boolean iniciarSO();
	
	Boolean acenderMonitor();
}
