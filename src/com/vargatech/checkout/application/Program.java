package com.vargatech.checkout.application;

import com.vargatech.checkout.repository.ChecklistRepository;
import com.vargatech.checkout.service.InspecaoService;
import com.vargatech.checkout.view.TerminalView;

import java.util.List;

public class Program {
	public static void main(String[] args) {

        ChecklistRepository repository = new ChecklistRepository();
        InspecaoService service = new InspecaoService(repository);
        TerminalView view = new TerminalView();

        List<String> sistemasDisponiveis = service.iniciarInspecao();

        view.mostarSistemasDisponeiveis(sistemasDisponiveis);

        List<String> sistemasEscolhidos = view.solicitarSistemasIntervidos(sistemasDisponiveis);

        System.out.println("\nSistemas escolhidos pelo usuário:");
        System.out.println(sistemasEscolhidos);



    }

}
