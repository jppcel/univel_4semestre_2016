package br.univel.patterns.adapter;

public class ConectorDoisPinoAdapter implements Conector {

	private ConectorTresPino tresPinos;

	public ConectorDoisPinoAdapter(final ConectorTresPino tresPinos) {
		this.tresPinos = tresPinos;
	}

	@Override
	public Integer getQuantidadePinos() {
		System.out.println(String.format(
				"Quantidade original � %d, por�m este adapter esta convertendo para 2",
				tresPinos.getQuantidadePinos()));
		return 2;
	}

	@Override
	public Float getVoltagem() {
		return tresPinos.getVoltagem();
	}

	@Override
	public Float getAmperagem() {
		return tresPinos.getAmperagem();
	}

}
