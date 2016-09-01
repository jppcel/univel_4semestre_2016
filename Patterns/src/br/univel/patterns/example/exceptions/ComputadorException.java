package br.univel.patterns.example.exceptions;

/**
 * Defini��o de exception base para o app
 * 
 * @author wcsantos
 *
 */
public abstract class ComputadorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ComputadorException(final String message) {
		super(message);
	}
}
