package aplication;

import entites.Checkin;

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
            List<Checkin> list = new ArrayList<>(1);
            for (int i = 0; i < x; i++) ;
            {
                System.out.println("PREENCHA AS INFORMACOES: ");
                System.out.println("Nome do tecnico responsavel: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Placa do veiculo a ser inspecionado: ");
                String placa = sc.nextLine();
                System.out.println("Teste ");
                sc.nextLine();
                LocalDateTime dataDaInspecao = LocalDateTime.now();


                list.add(new Checkin(nome, dataDaInspecao, placa));
            }
            for (Checkin checkin : list) {
                System.out.println(list);
            }

            sc.close();
        }
        else {
            System.out.println("Fora do sistema!");
        }
    }

}
