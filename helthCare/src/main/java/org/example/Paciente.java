package org.example;

class Paciente implements Diagnostico{
    public double peso;
    public double altura;
    public String nome;

    public Paciente(double peso, double altura, String nome) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;

    }


    public void setPaciente(double peso, double altura, String nome) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Double calcularIMC() {
        double imc;
        imc = peso / (altura * altura);
        return imc;
    }

    @Override
    public String diagnosticoPaciente() {
        double imc = calcularIMC();
        if (imc < 16) {
            return "baixo peso muito grave";
        } else if (imc >= 16 && imc < 17) {
            return "baixo peso grave";
        } else if (imc >= 17 && imc < 18.5) {
            return "baixo peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "obesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            return "obesidade grau II";
        } else {
            return "obesidade grau III (obesidade mórbida)";
        }
    }

    @Override
    public String toString() {
        return "O diagnóstico do(a) paciente " + nome + " é " + diagnosticoPaciente() + " apresentando IMC de " + calcularIMC() + " kg/m²";
    }
}