package br.univel.duelo.lojamunicao;

public class LojaMunicao {

	private Integer municoes = 8;
	private static LojaMunicao instancia;

	private LojaMunicao() {
	}

	public static LojaMunicao getInstancia() {
		if (instancia == null) {
			instancia = new LojaMunicao();
		}
		return instancia;
	}

	public Integer venda(final Integer quantidade) {
		Integer quantidadeVendida = 0;
		if (quantidade >= municoes) {
			quantidadeVendida = municoes;
			municoes = 0;
		} else {
			municoes -= quantidade;
			quantidadeVendida = quantidade;
		}
		return quantidadeVendida;
	}
}
