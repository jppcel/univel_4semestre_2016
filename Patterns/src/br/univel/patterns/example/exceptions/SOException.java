package br.univel.patterns.example.exceptions;

public class SOException extends ComputadorException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SOException(){
		super("SO não encontrado");
	}
}
