package br.univel.patterns.adapter;

public class ConectorTresPino implements Conector {

	@Override
	public Integer getQuantidadePinos() {
		return 3;
	}

	@Override
	public Float getVoltagem() {
		return 12F;
	}

	@Override
	public Float getAmperagem() {
		return 7F;
	}

}
