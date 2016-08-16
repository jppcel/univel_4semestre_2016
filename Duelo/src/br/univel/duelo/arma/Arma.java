package br.univel.duelo.arma;

public interface Arma {

	Float atirar();

	Float potenciaTiro();

	Float precisaoTiro();

	Arma recarregar(final Integer municoes);

	Boolean temMunicoes();
	
	void adicionarObservador(final ArmaObservador observador);
}
