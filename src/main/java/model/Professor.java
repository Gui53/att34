package model;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {

    private double salario;
    private String titulo;

    public Professor(double salario, String titulo) {
        this.salario = salario;
        this.titulo = titulo;
    }

    public Professor(double salario, String titulo, String nome, int idade) {
        super(nome, idade);
        this.salario = salario;
        this.titulo = titulo;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Titulo: " + titulo);
        JOptionPane.showMessageDialog(null, "Salário: " + salario);

    }

    @Override
    public void leitura() {
        super.leitura();
        titulo = JOptionPane.showInputDialog("Digite seu titulo:");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario:"));

    }

}
