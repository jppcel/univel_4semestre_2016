package br.univel.duelo;

import java.util.Arrays;

import br.univel.duelo.arma.Arma;
import br.univel.duelo.arma.ArmaFactory;
import br.univel.duelo.arma.TipoArma;
import br.univel.duelo.lojamunicao.LojaMunicao;
import br.univel.duelo.pistoleiro.Pistoleiro;
import br.univel.duelo.pistoleiro.PistoleiroFactory;
import br.univel.duelo.pistoleiro.TipoPistoleiro;
import br.univel.duelo.pistoleiro.bando.BandoFactory;
import br.univel.duelo.pistoleiro.bando.PistoleiroBando;

public class DueloBuilder {

	private String nome1;
	private TipoPistoleiro tipo1;
	private String nome2;
	private TipoPistoleiro tipo2;
	private PistoleiroFactory pistoleiroFactory;
	private ArmaFactory armaFactory;
	private LojaMunicao lojaMunicao;

	public String getNome1() {
		return this.nome1;
	}

	public DueloBuilder setNome1(final String nome1) {
		this.nome1 = nome1;
		return this;
	}

	public TipoPistoleiro getTipo1() {
		return this.tipo1;
	}

	public DueloBuilder setTipo1(final TipoPistoleiro tipo1) {
		this.tipo1 = tipo1;
		return this;
	}

	public String getNome2() {
		return this.nome2;
	}

	public DueloBuilder setNome2(String nome2) {
		this.nome2 = nome2;
		return this;
	}

	public TipoPistoleiro getTipo2() {
		return tipo2;
	}

	public DueloBuilder setTipo2(TipoPistoleiro tipo2) {
		this.tipo2 = tipo2;
		return this;
	}

	public PistoleiroFactory getPistoleiroFactory() {
		return pistoleiroFactory;
	}

	public DueloBuilder setPistoleiroFactory(PistoleiroFactory pistoleiroFactory) {
		this.pistoleiroFactory = pistoleiroFactory;
		return this;
	}

	public ArmaFactory getArmaFactory() {
		return armaFactory;
	}

	public DueloBuilder setArmaFactory(ArmaFactory armaFactory) {
		this.armaFactory = armaFactory;
		return this;
	}

	public LojaMunicao getLojaMunicao() {
		return lojaMunicao;
	}

	public DueloBuilder setLojaMunicao(LojaMunicao lojaMunicao) {
		this.lojaMunicao = lojaMunicao;
		return this;
	}

	public Duelo build() {
		final Pistoleiro pistoleiro1 = this.pistoleiroFactory.create(tipo1, nome1);
		final Pistoleiro pistoleiro2 = this.pistoleiroFactory.create(tipo2, nome2);
		final Arma arma1 = this.armaFactory.create(TipoArma.LONGA);
		final Arma arma2 = this.armaFactory.create(TipoArma.LONGA);
		arma1.recarregar(this.lojaMunicao.venda(10));
		arma2.recarregar(this.lojaMunicao.venda(10));
		arma1.adicionarObservador(pistoleiro1);
		arma2.adicionarObservador(pistoleiro2);
		pistoleiro1.setArma(arma1);
		pistoleiro2.setArma(arma2);
		return new Duelo(pistoleiro1, pistoleiro2);
	}
	
	public Pistoleiro buildBando(final String nomeBando, 
			final String... pistoleiros){
		final BandoFactory factory = new BandoFactory();
		final PistoleiroBando bando = factory.create(
				TipoPistoleiro.DENTRO_DA_LEI, nomeBando);
		Arrays.stream(pistoleiros).forEach(nome -> {
			final Pistoleiro p = this.pistoleiroFactory.
					create(this.tipo1, nome);
			final Arma arma = this.armaFactory.create(
					TipoArma.LONGA);
			arma.recarregar(this.lojaMunicao.venda(10));
			arma.adicionarObservador(p);
			p.setArma(arma);
			bando.adicionarIntegrante(p);
		});
		return bando;
	}
}
