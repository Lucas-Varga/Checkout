package com.vargatech.checkout.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Inspecao {

    private String nome;
    private LocalDateTime dataDaInspecao;
    private String placa;
    private List<String> sistemasIntervidos;
    private List<String> itensVerificados;


    public Inspecao(String nome, String placa) {
        // Validação básica
        if (nome == null || nome.isBlank() || placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Nome e Placa são obrigatórios para iniciar uma inspeção.");
        }

        this.nome = nome;
        this.placa = placa;
        this.dataDaInspecao = LocalDateTime.now();

        this.sistemasIntervidos = new ArrayList<>();
        this.itensVerificados = new ArrayList<>();
    }

    public List<String> getSistemasIntervidos() {
        return sistemasIntervidos;
    }

    public List<String> getItensVerificados() {
        return itensVerificados;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getDataDaInspecao() {
        return dataDaInspecao;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Inspecao{" +
                "nome='" + nome + '\'' +
                ", dataDaInspecao=" + dataDaInspecao +
                ", placa='" + placa + '\'' +
                ", sistemasIntervidos=" + sistemasIntervidos +
                ", itensVerificados=" + itensVerificados +
                '}';
    }
}
