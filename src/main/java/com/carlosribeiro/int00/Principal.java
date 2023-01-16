package com.carlosribeiro.int00;

public class Principal {

    public static void main(String[] args) {

        Empregado e1;
        Empregado e2;
		e1 = new Empregado("Sergio", 8000);
		e2 = new Empregado("Lucia", 9000);
		System.out.println(e1.getNome() + "  " + e1.getSalario());
		System.out.println(e2.getNome() + "  " + e2.getSalario());

        e2 = new Empregado(); //se eu chamar esse construtor e não criá-lo, dará erro

        e2.setNome("Lucia");
        e2.setSalario(7000);

        System.out.println(e2.getNome() + "  " + e2.getSalario());
        System.out.println(Empregado.getTelefone()); // variável da classe Empregado
    }
}
