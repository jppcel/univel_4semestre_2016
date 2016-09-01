package br.univel.patterns.example.exceptions;

public class MemoriaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MemoriaException(){
		super("Falha ao iniciar a memoria do computador");
	}

}
