package com.carlosribeiro.int00;

// CTRL + SHIFT + '+'
// CTRL + SHIFT + '-'
public class Empregado {
    private static String telefone; // variável de classe
    private String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    //Não é criado automaticamente pois já existe um método construtor
    public Empregado() {

    }

    //Método static incide sobre a classe
    //Dentro do método estático só pode referenciar
    public static String getTelefone() {
        return telefone;
    }
    public static void setTelefone(String telefone) {
        Empregado.telefone = telefone;
    }
    public void imprime() {
        System.out.println("Nome = " + nome + "  Salário = " + salario);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Empregado.getTelfone - Método static pois acessa através da classe
    // e1.getTelefone() - Método não static pois acessa pelo objeto
}