package br.univel.patterns.facade;

public class Desktop implements Computador {

	@Override
	public Boolean iniciarCPU() {
		System.out.println("CPU iniciada com sucesso");
		return false;
	}

	@Override
	public Boolean iniciarMemoria() {
		System.out.println("Memoria iniciada com sucesso");
		return true;
	}

	@Override
	public Boolean iniciarDisco() {
		System.out.println("Disco iniciado com sucesso");
		return true;
	}

	@Override
	public Boolean iniciarSO() {
		System.out.println("SO iniciado com sucesso");
		return true;
	}

	@Override
	public Boolean acenderMonitor() {
		System.out.println("Enviando sinal ao monitor");
		return true;
	}

}
