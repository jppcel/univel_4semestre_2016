package br.univel.patterns.builder.simpleobject;

/**
 * Builder para criação de pessoa, este terá as mesmas variáveis que pessoa,
 * porém é possivel ir setando estas e depois criar uma {@link Pessoa}, devido o
 * uso de interface fluente fica mais fácil ainda a criação de objetos
 * 
 * @author Will
 *
 */
public class PessoaBuilder {

	private String sobrenome;
	private String nome;
	private String cpf;
	private String rg;
	private String apelido;
	private String logradouro;
	private String cidade;
	private String estado;

	public String getSobrenome() {
		return sobrenome;
	}

	public PessoaBuilder setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public PessoaBuilder setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getCpf() {
		return cpf;
	}

	public PessoaBuilder setCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public String getRg() {
		return rg;
	}

	public PessoaBuilder setRg(String rg) {
		this.rg = rg;
		return this;
	}

	public String getApelido() {
		return apelido;
	}

	public PessoaBuilder setApelido(String apelido) {
		this.apelido = apelido;
		return this;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public PessoaBuilder setLogradouro(String logradouro) {
		this.logradouro = logradouro;
		return this;
	}

	public String getCidade() {
		return cidade;
	}

	public PessoaBuilder setCidade(String cidade) {
		this.cidade = cidade;
		return this;
	}

	public String getEstado() {
		return estado;
	}

	public PessoaBuilder setEstado(String estado) {
		this.estado = estado;
		return this;
	}

	/**
	 * Build é responsavel por criar a pessoa com o parametros que desejarmos
	 * 
	 * @return
	 */
	public Pessoa build() {
		return new Pessoa(this.sobrenome, this.nome, this.cpf, this.rg, this.apelido, this.logradouro, this.cidade,
				this.estado);
	}

}
