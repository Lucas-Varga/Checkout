package com.vargatech.checkout.view;

import com.vargatech.checkout.model.Inspecao;

import java.util.Scanner;

public class TerminalView {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a placa: ");
        String placa = sc.nextLine();

        Inspecao inspection;
        inspection = new Inspecao(nome, placa);

        System.out.println(inspection);

        sc.close();
    }

}
