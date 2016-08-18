package br.univel.duelo.policial;

import br.univel.duelo.pistoleiro.Pistoleiro;
import br.univel.duelo.pistoleiro.PistoleiroFactory;
import br.univel.duelo.pistoleiro.TipoPistoleiro;
import br.univel.duelo.pistoleiro.usa.UsaPistoleiroFactory;

public class PoliciaPistoleiroFactory extends UsaPistoleiroFactory implements PistoleiroFactory {

	@Override
	public Pistoleiro create(final TipoPistoleiro tipo, 
			final String nome) {
		Pistoleiro pistoleiro;
		switch (tipo) {
		case FORA_DA_LEI:
			pistoleiro = super.create(tipo, nome);
			break;
		case DENTRO_DA_LEI:
			pistoleiro = new PistoleiroAdapter(new RoboCop());
			break;
		default:
			pistoleiro = super.create(tipo, nome);
			break;
		}
		return pistoleiro;
	}

}
