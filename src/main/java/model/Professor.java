package model;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {

    private double salario;
    private static final String titulo = "Doutor";

    public Professor() {
        this(0, "", "", 0);
    }

    public Professor(double salario, String titulo, String nome, int idade) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "nome=" + getNome() + ", idade=" + getIdade() + ", salario=" + salario + ", titulo=" + titulo;
    }

    
    
    @Override
    public void imprimir() {
//        super.imprimir();
        JOptionPane.showMessageDialog(null, toString());

    }

    @Override
    public void leitura() {
        super.leitura();
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario:"));

    }

    @Override
    public void getNomeFormatado() {
        JOptionPane.showMessageDialog(null, titulo + ", " + super.getNome());
    }

}
