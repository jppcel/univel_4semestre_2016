package br.univel.patterns.adapter;

/**
 * Representa uma tomada que aceita conexão dos pinos apenas, e nada diferente
 * disso
 * 
 * @author Will
 *
 */
public class ConexaoDoisPino {

	private Boolean conectado = false;

	/**
	 * Utilizado padrão singleton nesta tomada
	 */
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
			throw new RuntimeException("Conector não aceita esta conexao devido a quantidade de pinos diferente");
		} else {
			conectado = true;
			System.out.println("Conexão sendo utilizada");
		}
	}

	public void desconectar() {
		if (!conectado) {
			throw new RuntimeException("Conectar não esta conectado, não é possivel desconetar");
		} else {
			conectado = false;
			System.out.println("Conexão desfeita");
		}
	}
}
