package model;

import javax.swing.JOptionPane;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
        this("", 0);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void leitura() {
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome);
        JOptionPane.showMessageDialog(null, "Idade: " + idade);

    }

}
