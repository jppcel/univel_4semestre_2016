package br.univel.duelo;

import br.univel.duelo.pistoleiro.Pistoleiro;

/**
 * Inicia um duelo entre os pistoleiros
 * 
 * @author Will
 *
 */
public class Duelo {

	private final Pistoleiro pistoleiro1;
	private final Pistoleiro pistoleiro2;

	public Duelo(final Pistoleiro pistoleiro1, final Pistoleiro pistoleiro2) {
		this.pistoleiro1 = pistoleiro1;
		this.pistoleiro2 = pistoleiro2;
	}

	public void duelar() {
		// Enquando os dois estiverem vivos o duelo continua
		while (pistoleiro1.estaVivo() && pistoleiro2.estaVivo()) {
			// Código faz o pistoleiro rachaCuca defender o tiro de tripaSeca, e
			// a linha abaixo faz o contrario. Como nosso jogo é simplificado
			// não precisa definir quem atira primeiro
			pistoleiro2.defenderTiro(pistoleiro1.atirar());
			pistoleiro1.defenderTiro(pistoleiro2.atirar());
		}

		// Verifica qual pistoleiro esta vivo e imprime o nome deste como
		// vencedor do duelo
		if (pistoleiro1.estaVivo() && !pistoleiro2.estaVivo()) {
			System.out.println(String.format("Pistoleiro %s vence o duelo", pistoleiro1.getNome()));
		} else if (!pistoleiro1.estaVivo() && pistoleiro2.estaVivo()) {
			System.out.println(String.format("Pistoleiro %s vence o duelo", pistoleiro2.getNome()));
		} else {
			// Se entrar no else é porque não houve ganhador
			System.out.println("Não houve vencedor do duelo");
		}
	}
}
