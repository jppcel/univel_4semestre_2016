
package br.univel.patterns.facade.exceptions;

public class CpuError implements ComputadorError{

	@Override
	public String getMessage() {
		return "CPU com defeito n�o � possivel iniciar";
	}

}
