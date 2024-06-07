package org.example;

import java.util.ArrayList;
import java.util.List;

public class HistoricoPacientes {
    public List<Paciente> prontuarioPacientes;
    public HistoricoPacientes() {
        this.prontuarioPacientes = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente Paciente) {
        prontuarioPacientes.add(Paciente);
    }

    public void listarPacientes() {
        if (prontuarioPacientes.isEmpty()) {
            System.out.println("Nenhum paciente encontrado.");
        } else {
            for (Paciente paciente : prontuarioPacientes) {
                System.out.println(paciente);
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }
        }
    }
}
