package br.univel.patterns.example.exceptions;

public class MonitorException extends ComputadorException{

	private static final long serialVersionUID = 1L;

	public MonitorException(){
		super("Comunição com o Monitor não disponivel");
	}
}
