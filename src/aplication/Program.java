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

        System.out.println("Deseja iniciar o programa? 1 SIM / 2 SAIR");

        int a = sc.nextInt();

        if (a == 1) {
            int x = 1;
            List<Checkin> listCheckin = new ArrayList<>(1);
            for (int i = 0; i < x; i++) ;
            {
                System.out.println("\nPREENCHA AS INFORMACOES: ");
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


            List<String> listaCheckup = new ArrayList<>();

            System.out.println("\n===CHECK-UP DE VEICULO====");

            System.out.println("\nFaca o check-up nos itens a seguir e marque S para OK e N para sair: ");

            System.out.println("\nNivel do oleo do motor: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaCheckup.add("Nivel do oleo do motor OK");
            }

            System.out.println("nivel do liquido de arrefecimento: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaCheckup.add("nivel do liquido de arrefecimento OK");
            }

            System.out.println("nivel do fluido da direcao hidraulica: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaCheckup.add("nivel do fluido da direcao hidraulica OK");
            }

            System.out.println("nivel do fluido de freio: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaCheckup.add("nivel do fluido de freio OK");
            }

            System.out.println("check-up no cofre do motor ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaCheckup.add("check-up no cofre do motor OK");
            }

            System.out.println("aperto das rodas: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaCheckup.add("aperto das rodas OK");
            }

            System.out.println("aperto do bujao do carter: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaCheckup.add("aperto do bujao do carter OK");
            }

            System.out.println("aperto do filtro de oleo: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaCheckup.add("aperto do filtro de oleo OK");
            }

            System.out.println("lampadas: S/N ");
            if (sc.next().equalsIgnoreCase("S")) {
                listaCheckup.add("lampadas OK");
            }

            System.out.println("\n===RESUMO DO CHECK-UP: ===");
            System.out.println("\nSistemas que sofreram intervencao: " + listaSistemas);
            System.out.println("\nItens verificados no check-up: " + listaCheckup);


            sc.close();
        }
        else {
            System.out.println("Fora do sistema!");
        }
    }

}
