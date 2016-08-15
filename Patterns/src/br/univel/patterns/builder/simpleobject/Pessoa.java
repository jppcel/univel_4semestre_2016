package br.univel.patterns.builder.simpleobject;

public class Pessoa {

	private final String sobrenome;
	private final String nome;
	private final String cpf;
	private final String rg;
	private final String apelido;
	private final String logradouro;
	private final String cidade;
	private final String estado;

	public Pessoa(final String sobrenome, final String nome, final String cpf, final String rg, final String apelido,
			final String logradouro, final String cidade, final String estado) {
		super();
		this.sobrenome = sobrenome;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.apelido = apelido;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getApelido() {
		return apelido;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

}