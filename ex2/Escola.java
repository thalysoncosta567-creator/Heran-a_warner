/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escola;

/**
 *
 * @author thaly
 */
public class Escola {

    
    
        
    public static void main(String[] args) {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome("Paulo");
        novoAluno.setIdade(18);
        novoAluno.setCurso("Engenharia de Computação");
        novoAluno.setPeriodo(1);
        System.out.println("\nMatricula do aluno:\n");
        System.out.printf("Nome: %s\nIdade: %d\nCurso: %s\nPeriodo: %d\n", novoAluno.getNome(), novoAluno.getIdade(), novoAluno.getCurso(), novoAluno.getPeriodo());
        
        Professor novoProfessor = new Professor();
        novoProfessor.setNome("Joao");
        novoProfessor.setIdade(42);
        novoProfessor.setNota(8);
        System.out.printf("\nProfessor: %s\nIdade: %d\nNota lancada: %d\n", novoProfessor.getNome(), novoProfessor.getIdade(), novoProfessor.getNota());
        
    }
    
}
