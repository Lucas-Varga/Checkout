package aplication;

import entites.Checkin;
import entites.SistemasIntervidos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja iniciar o programa? 1 SIM / 2 SAIR)");

        int a = sc.nextInt();

        if (a == 1) {
            int x = 1;
            List<Checkin> listCheckin = new ArrayList<>(1);
            for (int i = 0; i < x; i++) ;
            {
                System.out.println("PREENCHA AS INFORMACOES: ");
                System.out.println("\nNome do tecnico responsavel: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Placa do veiculo a ser inspecionado: ");
                String placa = sc.nextLine();
                LocalDateTime dataDaInspecao = LocalDateTime.now();
                listCheckin.add(new Checkin(nome, dataDaInspecao, placa));
            }
            for (Checkin checkin : listCheckin) {
                System.out.println(listCheckin);
            }
            List<String> listaSistemas = new ArrayList<>();

            System.out.println("\nConfirme os sistemas que sofreram intervencao no veiculo com S/N: ");

            System.out.println("\nMotor: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaSistemas.add("motor");
            }
            System.out.println("Suspensao: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaSistemas.add("suspensao");
            }
            System.out.println("Freio: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaSistemas.add("freio");
            }
            System.out.println("Cambio: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaSistemas.add("cambio");
            }
            System.out.println("Arrefecimento: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaSistemas.add("arrefecimento");
            }
            System.out.println("Injecao Eletronica: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaSistemas.add("injecao Eletronica");
            }
            System.out.println("ABS: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaSistemas.add("ABS");
            }
            System.out.println("Airbag: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaSistemas.add("airbag");
            }

            System.out.println("\nSistemas que sofreram intervencao: " + listaSistemas);


            sc.close();
        }
        else {
            System.out.println("Fora do sistema!");
        }
    }

}
