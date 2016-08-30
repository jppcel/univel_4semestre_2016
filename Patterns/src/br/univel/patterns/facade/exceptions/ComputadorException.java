package br.univel.patterns.facade.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ComputadorException extends RuntimeException {

	private List<ComputadorError> erros = new ArrayList<>();

	public ComputadorException(List<ComputadorError> erros) {
		this.erros = erros;
	}
	
	public List<ComputadorError> getErros() {
		return erros;
	}

}
