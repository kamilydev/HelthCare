package org.example;

public class Principal {
    public static void main(String[] args) {
        // Criação de instâncias da classe Paciente
        Paciente paciente1 = new Paciente(70, 1.75);
        paciente1.setNome("Lucas");

        Paciente paciente2 = new Paciente(50, 1.60);
        paciente2.setNome("Maria");

        Paciente paciente3 = new Paciente(90, 1.80);
        paciente3.setNome("João");

        // Imprimindo o resultado dos métodos calcularIMC e diagnostico
        System.out.println("O diagnóstico do pac. " + paciente1.nome + " é " + paciente1.diagnostico() + " = IMC entre " + String.format("%.2f", paciente1.calcularIMC()) + " kg/m²");
        System.out.println("O diagnóstico do pac. " + paciente2.nome + " é " + paciente2.diagnostico() + " = IMC entre " + String.format("%.2f", paciente2.calcularIMC()) + " kg/m²");
        System.out.println("O diagnóstico do pac. " + paciente3.nome + " é " + paciente3.diagnostico() + " = IMC entre " + String.format("%.2f", paciente3.calcularIMC()) + " kg/m²");
    }
}
