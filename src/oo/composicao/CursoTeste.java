package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Paula");
        Aluno aluno3 = new Aluno("Patrick");

        Curso curso1 = new Curso("História");
        Curso curso2 = new Curso("Física");
        Curso curso3 = new Curso("Matemática");

        curso1.adicionarAluno(aluno3);
        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);

        for (Aluno aluno : curso1.alunos){
            System.out.println("\nMatriculado curso 1: " + aluno.nome);

        }
    }
}
