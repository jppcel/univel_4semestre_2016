package br.univel.patterns.adapter;

public class ConexaoDoisPino {

	private Boolean conectado = false;

	private static ConexaoDoisPino instancia;

	private ConexaoDoisPino() {
	}

	public static ConexaoDoisPino getInstancia() {
		if (instancia == null) {
			instancia = new ConexaoDoisPino();
		}
		return instancia;
	}

	public void conectar(final Conector conector) {
		if (conector.getQuantidadePinos() != 2) {
			throw new RuntimeException("Conector n�o aceita esta conexao devido a quantidade de pinos diferente");
		} else {
			conectado = true;
			System.out.println("Conex�o sendo utilizada");
		}
	}

	public void desconectar() {
		if (!conectado) {
			throw new RuntimeException("Conectar n�o esta conectado, n�o � possivel desconetar");
		} else {
			conectado = false;
			System.out.println("Conex�o desfeita");
		}
	}
}
