# CarCheck360 Backend

Descrição do programa:

Aplicativo Android desenvolvido para otimizar o fluxo de entrega de veículos reparados em concessionárias, centros automotivos e oficinas mecânicas, garantindo qualidade e segurança na finalização dos serviços.

Quando for concluído a manutenção em um veiculo, o responsável pela qualidade deverá utilizar esse programa para fazer as verificações de qualidade e segurança antes da liberação do veículo para o cliente.

# O programa em si.

O programa deverá rodar nativamente em smartphones android ( a principio).

Ao entrar no programa, o usuário deverá preencher o seu nome e a placa do veículo, ( a data será instanciada automaticamente). Após isso, o programa solicitará ao usuário para informar em quais sistemas o veículo sofreu intervenção (a solicitação poderá ser por meio de tickagem). 

Após isso, o programa inicia um método de tickagem para o usuário confirmar as verificações a serem feitas no veiculo.

Caso o usuário deseje visualizar a lista completa de itens, deverá marcar um campo afirmando estar ciente do riscos e assumindo a responsabilidade pela verificação “manual”, então o programa mostrará a listas de todos os itens de verificação sem mesmo terem sido tickados.

- **`*Link repostirory-Git:*`**
    
    [https://github.com/Varga-tech-Java/Checkout](https://github.com/Varga-tech-Java/Checkout)
    

# Estrutura do projeto:

- com
    - vargatech
        - checkout
            - application
                - Program
            - model
                - Inspecao
                - SistemasIntervidos
            - repository
                - ChecklistRepository
            - service
                - InspecaoService
            - view
                - TerminalView

# LOGICAS:

- Criar loop para permitir o usuario ficar no sistema, ou saia quando desejar.
- Criar tratamento de exceções e formatação padrão para cada campo de entrada de informação digitada..
- Checklist adaptado de acordo com cada tipo de intervenção realizada no veiculo.

### Lista de itens CheckList:

- Lista:
    - Nivel do oleo do motor
    - nivel do liquido de arrefecimento
    - nivel do fluido da direção hidraulica
    - nivel do fluido de freio
    - check-up no cofre do motor
    - aperto das rodas
    - aperto do bujão do carter
    - aperto do filtro de oleo
    - lampadas

# `Primeira versão pronta do projeto:`

<aside>
❗

### Todo o código foi escrito no programa principal, sem utilização de orientação a objetos, e separação de responsabilidades.

</aside>

- **`Codigo da primeira versão pronta:`**
    
    ```java
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
    
            System.out.println("Deseja iniciar o programa? 1 SIM / 2 NAO");
    
                int a = sc.nextInt();
    
                System.out.println("\nPara sair, digite 0 a qualquer momento.");
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
    
                } else {
                    System.out.println("Fora do sistema!");
                }
    
            sc.close();
        }
    
    }
    
    ```
    
- **`*Link repostirory-Git:*`**
    
    [https://github.com/Varga-tech-Java/Checkout](https://github.com/Varga-tech-Java/Checkout)
    

# `Segunda versão do projeto:`

<aside>
💡

- *Criar novas brachs no Git.*
- *Reorganizar os pacotes, adicionar as informações nas classes, modificar a estrutura do programa aplicando injeção de dependencia  e inversão de controle e separação de responsabilidades.*
</aside>

## `Estudos para melhorar o programa:`

- Git
    - `o que são branches no git"`
    - `"git workflow para iniciantes"`
    - `"como criar uma nova branch no git e github`
- Convenção de Pacotes Java (Java Package Naming Convention):
    - `convenção de nomes de pacotes em java"`
    - `"como organizar pacotes em um projeto java"`
    - `"java project structure best practices"`
- POJO (Plain Old Java Object)
    
    [POJO.](https://www.notion.so/POJO-2bc226ef687a800cb353fdce848de788?pvs=21)
    
- Injeção de Dependência (conceito inicial)
- Composição vs. Herança
    - `herança vs composição java quando usar"`
    - `"composition over inheritance java"`
- Polimorfismo
    - `o que é polimorfismo em java"`
    - `"exemplo prático de polimorfismo em java"`
    - `"java instanciar objeto de acordo com variavel"`
- Composição sobre Herança
- Herança
    - `herança em java extends"`
    - `"java superclass e subclass exemplo"`
    - `"reutilização de código com herança em java"`
    
- Método `toString()`
    - `"java override tostring exemplo"`
    - `"como formatar a saida de um objeto no system.out.println"`
    - `"sobrescrever método toString na classe"`
- Arquitetura em Camadas (Layered Architecture):
    - `"arquitetura em 3 camadas java"`
    - `"model view controller mvc java simples"` (MVC é um padrão um pouco mais avançado, mas a ideia de separar responsabilidades é a mesma).
- Princípio da Responsabilidade Única (SRP)
- Separação de Preocupações
- Classes de Serviço
- Iteração sobre Coleções (Looping through Collections):
    - `java for each loop com arraylist"`
    - `"como percorrer uma lista em java"`
    - `"refatorar código repetido com loop em java"` (A palavra **refatorar** significa melhorar o código sem alterar seu comportamento externo. É exatamente o que você quer fazer).

# Estrutura do projeto:

- com
    - vargatech
        - checkout
            - application
                - Program
            - model
                - Inspecao
                - SistemasIntervidos
            - repository
                - ChecklistRepository
            - service
                - InspecaoService
            - view
                - TerminalView
