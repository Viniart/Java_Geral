package Classes;

public class Main {

	public static void main(String[] args) {
		
		Aluno[] alunos = new Aluno[3];
		
		alunos[0] = new Aluno("Selmini", 88392);
		alunos[1] = new Aluno("Patricia", 23551);
		alunos[2] = new Aluno("J", 42567);
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.nome);
		}
	}

}
