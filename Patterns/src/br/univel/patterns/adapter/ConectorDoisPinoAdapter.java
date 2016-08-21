package br.univel.patterns.adapter;

/**
 * Classe para fazer a adaptação de uma tomada de tres pinos para uma de dois
 * pinos
 * 
 * @author Will
 *
 */
public class ConectorDoisPinoAdapter implements Conector {

	private ConectorTresPino tresPinos;

	public ConectorDoisPinoAdapter(final ConectorTresPino tresPinos) {
		this.tresPinos = tresPinos;
	}

	@Override
	public Integer getQuantidadePinos() {
		System.out.println(String.format("Quantidade original é %d, porém este adapter esta convertendo para 2",
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
