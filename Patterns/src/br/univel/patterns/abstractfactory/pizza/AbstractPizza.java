package br.univel.patterns.abstractfactory.pizza;

abstract class AbstractPizza {

	private String nome;

	public AbstractPizza(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
