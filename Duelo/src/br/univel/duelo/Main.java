package br.univel.duelo;

import br.univel.duelo.arma.ArmaFactory;
import br.univel.duelo.lojamunicao.LojaMunicao;
import br.univel.duelo.pistoleiro.Pistoleiro;
import br.univel.duelo.pistoleiro.TipoPistoleiro;
import br.univel.duelo.policial.PoliciaPistoleiroFactory;

public class Main {

	public static void main(final String[] args) {
		final DueloBuilder builder = new DueloBuilder();
		builder.setNome1("Perigo")
			.setTipo1(TipoPistoleiro.FORA_DA_LEI)
			.setNome2("Puliça")
			.setTipo2(TipoPistoleiro.DENTRO_DA_LEI)
			.setPistoleiroFactory(new PoliciaPistoleiroFactory())
			.setArmaFactory(new ArmaFactory())
			.setLojaMunicao(LojaMunicao.getInstancia());
		//final Duelo duelo = builder.build();
		final Pistoleiro bando1 = builder.buildBando(
				"Bando do velho jack", "Veio Jack", 
				"Novo Jack", "Não sei se eh Jack");
		final Pistoleiro bando2 = builder.buildBando(
				"Bando dos bebados habilidosos", "Bebum",
				"Musum", "Paulão do Velhas");
		final Duelo duelo = new Duelo(bando1, bando2);
		duelo.duelar();
	}

}
