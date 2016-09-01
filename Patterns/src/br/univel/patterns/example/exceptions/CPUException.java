package br.univel.patterns.example.exceptions;

public class CPUException extends ComputadorException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CPUException() {
		super("Falha ao iniciar a CPU");
	}
}
