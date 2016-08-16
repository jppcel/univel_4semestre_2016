package br.univel.patterns.observer.implobj;

public class MainObserverOBJ {

	public static void main(final String[] args) {
		final Professor professor = new Professor();
		final AlunoDedicado alunoA1 = new AlunoDedicado("A1");
		final AlunoDistraido alunoB1 = new AlunoDistraido("B1");
		professor.addObservers(alunoA1);
		professor.addObservers(alunoB1);
		professor.darAula();
	}
}
