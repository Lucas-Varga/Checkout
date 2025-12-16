package com.vargatech.checkout.service;

import com.vargatech.checkout.repository.ChecklistRepository;

import java.util.List;

public class InspecaoService {

    private final ChecklistRepository checklistRepository;

    public InspecaoService(ChecklistRepository checklistRepository) {
        this.checklistRepository = checklistRepository;
    }

    public List<String> iniciarInspecao(){
        System.out.println("Inspecao iniciada");

        List<String> sistemas = checklistRepository.getTodosOsSistemasDisponiveis();

        return sistemas;
    }
}
