package model;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

    private String curso;

    public Aluno() {
        this("", "", 0);
    }

    public Aluno(String curso, String nome, int idade) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "nome=" + super.getNome() + ", idade=" + super.getIdade() + "curso=" + curso;
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, toString());
    }

    @Override
    public void leitura() {
        super.leitura();
        curso = JOptionPane.showInputDialog("Digite seu curso:");
    }

    @Override
    public void getNomeFormatado() {
        JOptionPane.showMessageDialog(null, super.getNome().toUpperCase());
    }

}
