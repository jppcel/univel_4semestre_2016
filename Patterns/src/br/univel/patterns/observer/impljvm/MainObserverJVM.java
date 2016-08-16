package br.univel.patterns.observer.impljvm;

public class MainObserverJVM {

	public static void main(final String[] args) {
		final Professor professor = new Professor();
		final AlunoDedicado alunoA1 = new AlunoDedicado("A1");
		final AlunoDistraido alunoB1 = new AlunoDistraido("B1");
		professor.addObserver(alunoA1);
		professor.addObserver(alunoB1);
		professor.darAula();
	}
}
