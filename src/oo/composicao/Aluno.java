package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        if (!this.cursos.contains(curso)) {
            this.cursos.add(curso);
            curso.adicionarAluno(this); // chama do outro lado
        }
    }


    Curso getCursoPorNome(String nome){
        for (Curso curso : this.cursos){
            if (curso.nome.equalsIgnoreCase(nome)){
                return  curso;
            }
        }
        return  null;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
