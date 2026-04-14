package model;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

    private String curso;

    public Aluno(String curso) {
        this.curso = curso;
    }

    public Aluno(String curso, String nome, int idade) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Curso: " + curso);
    }

    @Override
    public void leitura() {
        super.leitura();
        curso = JOptionPane.showInputDialog("Digite seu curso:");
    }

}
