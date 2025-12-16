package com.vargatech.checkout.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TerminalView {

    private final Scanner scanner;

    public TerminalView() {
        this.scanner = new Scanner(System.in);
    }

    public void mostarSistemasDisponeiveis(List<String> sistemas){
        System.out.println("\n=== Sistemas disponiveis para inspeção === ");
        for (int i = 0;  i < sistemas.size(); i ++) {
            System.out.println((i + 1) + "." + sistemas.get(i));
        }
    }

    public List<String> solicitarSistemasIntervidos(List<String> sistemasDisponiveis){
        System.out.println("\nDigite o numero dos sistemas que foram intervidos, separados por uma virgula (ex: 1,3,5): ");
        List<String> sistemasEscolhidos = new ArrayList<>();

        String linhaDigitada = scanner.nextLine();

        String[] numerosComoTexto = linhaDigitada.split(",");
        for (String numeroStr : numerosComoTexto){
            try {
                int indice = Integer.parseInt(numeroStr.trim()) - 1;

                if (indice >= 0 && indice < sistemasDisponiveis.size()) {
                    String sistemaEscolhido = sistemasDisponiveis.get(indice);
                    sistemasEscolhidos.add(sistemaEscolhido);
                } else {
                    System.out.println("Atenção: O número " + (indice + 1) + " é uma opção inválida e será ignorado.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Atenção: '" + numeroStr + "' não é um número válido e será ignorado.");
            }
        }
        return sistemasEscolhidos;
    }
}
