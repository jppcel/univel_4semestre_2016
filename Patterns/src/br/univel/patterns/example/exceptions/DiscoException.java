package br.univel.patterns.example.exceptions;

public class DiscoException extends ComputadorException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DiscoException(){
		super("Disco corrompido");
	}
}
