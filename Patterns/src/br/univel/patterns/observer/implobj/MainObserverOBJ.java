package br.univel.patterns.observer.implobj;

/**
 * <pre>
 * http://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
 * Padrão observer é utilizado para dizer que um objeto será observado por outros, estes outros objetos receberão uma notificação de alteração do objeto observado, sempre que este mudar algo no seu status
 * Este exemplo utiliza não utiliza o padrão do java, é feito observer inteiro
 * </pre>
 * 
 * @author Will
 *
 */
public class MainObserverOBJ {

	public static void main(final String[] args) {
		// Professor é o objeto observado
		final Professor professor = new Professor();
		// Alunos são os observadores de professor, este recebem uma notificação
		// de qualquer alteração no status de professor e decidem o que farão
		// com esta informação
		final AlunoDedicado alunoA1 = new AlunoDedicado("A1");
		final AlunoDistraido alunoB1 = new AlunoDistraido("B1");
		// Para que os observadores sejam notificados é necessário registralos
		// no objeto observado
		professor.addObservers(alunoA1);
		professor.addObservers(alunoB1);
		professor.darAula();
	}
}
