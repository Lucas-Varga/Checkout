package com.vargatech.checkout.service;

import com.vargatech.checkout.repository.ChecklistRepository;

public class InspecaoService {

    private final ChecklistRepository checklistRepository

    public InspecaoService(ChecklistRepository checklistRepository) {
        this.checklistRepository = checklistRepository;
    }

    public void iniciarInspecao(){


        System.out.println("Inicada uma nova inspeção");
    }
}
