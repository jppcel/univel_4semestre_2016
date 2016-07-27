package br.univel.duelo;

/**
 * Inicia um duelo entre os pistoleiros
 * 
 * @author Will
 *
 */
public class Duelo {

	public static void main(String[] args) {
		// Inst�ncia dois pistoleiro para duelar
		Pistoleiro tripaSeca = new Pistoleiro("Tripa Seca");
		Pistoleiro rachaCuca = new Pistoleiro("Racha cuca");

		// Enquando os dois estiverem vivos o duelo continua
		while (tripaSeca.estaVivo() && rachaCuca.estaVivo()) {
			// C�digo faz o pistoleiro rachaCuca defender o tiro de tripaSeca, e
			// a linha abaixo faz o contrario. Como nosso jogo � simplificado
			// n�o precisa definir quem atira primeiro
			rachaCuca.defenderTiro(tripaSeca.atirar());
			tripaSeca.defenderTiro(rachaCuca.atirar());
		}

		// Verifica qual pistoleiro esta vivo e imprime o nome deste como
		// vencedor do duelo
		if (tripaSeca.estaVivo() && !rachaCuca.estaVivo()) {
			System.out.println("Pistoleiro Tripa seca vence o duelo");
		} else if (!tripaSeca.estaVivo() && rachaCuca.estaVivo()) {
			System.out.println("Pistoleiro Racha Cuca vence o duelo");
		} else {
			// Se entrar no else � porque n�o houve ganhador
			System.out.println("N�o houve vencedor do duelo");
		}

	}
}
