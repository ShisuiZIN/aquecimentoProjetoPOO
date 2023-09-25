package aquecimentoProjetoPOO;

import java.util.ArrayList;

public class CentralDeInformacoes {
	private ArrayList<Aluno> todosOsAlunos=new ArrayList<>();
	public boolean adicionarAluno(Aluno aluno) {
		for(Aluno a:todosOsAlunos) {
			if(a.getMatricula().equals(aluno.getMatricula()))
				return false;
		}
		todosOsAlunos.add(aluno); 
		return true;
		
	}
	public Aluno recuperarAlunoPorMatricula(String matricula) {
		for(Aluno a:todosOsAlunos) {
			if(a.getMatricula().equals(matricula))
				return a;
		}
		return null;
	}
	public ArrayList<Aluno> getTodosOsAlunos() {
		return todosOsAlunos;
	}
	public void setTodosOsAlunos(ArrayList<Aluno> todosOsAlunos) {
		this.todosOsAlunos = todosOsAlunos;
	}
}

