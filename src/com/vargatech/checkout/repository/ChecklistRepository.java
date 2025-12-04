package com.vargatech.checkout.repository;

import java.util.List;

public class ChecklistRepository {

    private final List<String> todosOsSistemasDisponiveis;

    public ChecklistRepository () {
        this.todosOsSistemasDisponiveis = List.of("Motor", "Suspensao", "Freio", "Cambio", "Arrefecimento", "InjecaoEletronica", "ABS", "Airbag" );
    }



}
