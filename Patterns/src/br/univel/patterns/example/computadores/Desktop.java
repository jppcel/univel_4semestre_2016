package br.univel.patterns.example.computadores;

class Desktop implements Computador{

	@Override
	public void iniciarCPU() {
		System.out.println("CPU iniciada");
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
		System.out.println("SO iniciado");
	}

	@Override
	public void iniciarMonitor() {
		System.out.println("Monitor iniciado");
	}

}
