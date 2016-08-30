package br.univel.patterns.facade;

import java.util.List;

import br.univel.patterns.facade.exceptions.ComputadorError;
import br.univel.patterns.facade.exceptions.ComputadorException;

public class MainFacade {

	public static void main(String[] args) {
		try {
			ComputadorFacade facade = new ComputadorFacade(new Desktop());
			facade.ligar();
			System.out.println("Computador ligado");
		} catch (ComputadorException ex) {
			System.out.println("Computador não pode ser iniciado");
			List<ComputadorError> erros = ex.getErros();
			erros.forEach(erro -> System.out.println(erro.getMessage()));
		}
	}
}
