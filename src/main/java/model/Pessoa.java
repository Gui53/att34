package model;

import javax.swing.JOptionPane;

public abstract class Pessoa {

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

    
    public String toString() {
        return "";
    }
    
    

    public void imprimir() {
        
        JOptionPane.showMessageDialog(null, toString());

    }
    
    public abstract void getNomeFormatado();
}
