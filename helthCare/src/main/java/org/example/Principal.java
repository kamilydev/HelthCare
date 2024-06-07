package org.example;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        HistoricoPacientes historicoPacientes = new HistoricoPacientes();
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("_____________________________________________________________________________________________________");
            System.out.println("## O que deseja executar? ##");
            System.out.println("Opção 1 - Cadastro de paciente");
            System.out.println("Opção 2 - Consultar o diagnóstico dos pacientes cadastrados");
            System.out.println("Opção 0 - Encerrar programa");
            System.out.println("_____________________________________________________________________________________________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    // Solicita o número de pacientes que o usuário deseja criar
                    System.out.print("Quantos pacientes você deseja cadastrar? ");
                    int qtdCadastro = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < qtdCadastro; i++) {
                        System.out.println("@@@@@@@ Dados do(a) paciente " + (i + 1) + " @@@@@@@");
                        System.out.println("___________________________________________________________________________________________________");

                        // Solicita o nome do(a) paciente
                        System.out.print("Digite o nome do(a) paciente: ");
                        String nome = scanner.nextLine();

                        // Solicita a altura do(a) paciente
                        System.out.print("Digite a altura do(a) paciente (em metros): ");
                        double altura = Double.parseDouble(scanner.nextLine());

                        // Solicita o peso do(a) paciente
                        System.out.print("Digite o peso do(a) paciente (em kg): ");
                        double peso = Double.parseDouble(scanner.nextLine());

                        Paciente novoPaciente = new Paciente(peso, altura, nome);

                        // Adicionando paciente ao historicoPacientes
                        historicoPacientes.adicionarPaciente(novoPaciente);
                        System.out.println("Paciente cadastrado com sucesso!");

                        // Exibindo o diagnóstico do paciente
                        System.out.println(novoPaciente);
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    }
                    break;

                case 2:
                    // Listando todos os prontuários dos pacientes
                    System.out.println("## Pacientes registrados ##");
                    historicoPacientes.listarPacientes();
                    break;

                case 0:
                    System.out.println("Aplicação encerrada");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}