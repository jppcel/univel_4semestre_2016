package br.univel.patterns.observer.implobj;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
 * Padr�o observer � utilizado para dizer que um objeto ser� observado por outros, estes outros objetos receber�o uma notifica��o de altera��o do objeto observado, sempre que este mudar algo no seu status
 * Este exemplo utiliza n�o utiliza o padr�o do java, � feito observer inteiro
 * </pre>
 * 
 * @author Will
 *
 */
public class MainObserverOBJ {

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
		professor.addObservers(alunoA1);
		professor.addObservers(alunoB1);
		professor.darAula();
	}
}
