package br.univel.patterns.facade;

public class MainFacade {

	public static void main(String[] args) {
		ComputadorFacade facade = new ComputadorFacade(new Desktop());
		facade.ligar();
		System.out.println("Computador ligado");
	}
}
