package br.univel.patterns.example.exceptions;

public class MonitorException extends ComputadorException{

	private static final long serialVersionUID = 1L;

	public MonitorException(){
		super("Comuni��o com o Monitor n�o disponivel");
	}
}
