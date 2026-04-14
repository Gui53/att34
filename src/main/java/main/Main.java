package main;

import model.Aluno;
import model.Professor;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        Professor prof = new Professor();
        
        aluno.leitura();
        prof.leitura();
        
//        aluno.imprimir();
//        prof.imprimir();
        
        aluno.getNomeFormatado();
                prof.getNomeFormatado();
    }
}
