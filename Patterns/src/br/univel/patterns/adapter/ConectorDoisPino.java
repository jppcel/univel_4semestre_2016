package br.univel.patterns.adapter;

public class ConectorDoisPino implements Conector{

	@Override
	public Integer getQuantidadePinos() {
		return 2;
	}

	@Override
	public Float getVoltagem() {
		return 12F;
	}

	@Override
	public Float getAmperagem() {
		return 5F;
	}

}
