package br.univel.patterns.observer.impljvm;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
 * Padr�o observe � utilizado para dizer que um objeto ser� observado por outros, estes outros objetos receber�o uma notifica��o de altera��o do objeto observado, sempre que este mudar algo no seu status
 * Este exemplo utiliza o padr�o dispon�vel com a JVM do java, por�m devido a utilizar extends, n�o � o ideal, � recomendav�l que se fa�a o seu proprio observer
 * </pre>
 * 
 * @author Will
 *
 */
public class MainObserverJVM {

	public static void main(final String[] args) {
		// Professor � o objeto observado
		final Professor professor = new Professor();
		// Alunos s�o os observadores de professor, este recebem uma notifica��o
		// de qualquer altera��o no status de professor e decidem o que far�o
		// com esta informa��o
		final AlunoDedicado alunoA1 = new AlunoDedicado("A1");
		final AlunoDistraido alunoB1 = new AlunoDistraido("B1");
		// Para que os observadores sejam notificados � necess�rio registralos
		// no objeto observado
		professor.addObserver(alunoA1);
		professor.addObserver(alunoB1);
		professor.darAula();
	}
}
