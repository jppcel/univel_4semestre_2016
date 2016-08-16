package br.univel.patterns.builder.complexobject;

import br.univel.patterns.builder.complexobject.bebida.CocaCola;
import br.univel.patterns.builder.complexobject.bebida.Pepsi;
import br.univel.patterns.builder.complexobject.hamburger.HamburgerFrango;
import br.univel.patterns.builder.complexobject.hamburger.HamburgerVegetariano;

public class RefeicaoBuilder {

	public Refeicao preparaRefeicaoVegetariana() {
		final Refeicao refeicao = new Refeicao();
		refeicao.adicionaItem(new HamburgerVegetariano());
		refeicao.adicionaItem(new CocaCola());
		return refeicao;
	}

	public Refeicao preparaRefeicaoCarnivora() {
		final Refeicao refeicao = new Refeicao();
		refeicao.adicionaItem(new HamburgerFrango());
		refeicao.adicionaItem(new Pepsi());
		return refeicao;
	}
}