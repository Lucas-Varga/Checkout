package com.vargatech.checkout.repository;

import java.util.*;

public class ChecklistRepository {

    private final List<String> todosOsSistemasDisponiveis;
    private final Map<String, List<String>> itensChecklistPorSistema;

    //construtor para inicializar toda a logica do checklist
    public ChecklistRepository(){
        //lista com os sistemas disponiveis
        this.todosOsSistemasDisponiveis = List.of("Motor", "Suspensao", "Freio", "Cambio", "Arrefecimento", "InjecaoEletronica", "ABS", "Airbag", "Pneus" );

        //Map temporario para armazenar as keys do map, com uma lista de verificação para cada sistema.
        Map<String, List<String>> mapaTemporario = new HashMap<>();
        mapaTemporario.put("Motor", List.of(
                "Verificar nivel de óleo do motor",
                "Verificar nivel do fluido de arrefecimento",
                "Polia do comando apertada?",
                "Polia do vira apertada?"));
        mapaTemporario.put("Suspensao", List.of(
                "Verificar aperto das rodas",
                "Porcas superiores dos amortecedores apertadas?"));

        //metodo de encapsulamento do mapa, inpedindo modificações externas, apenas visualização.
        this.itensChecklistPorSistema = Collections.unmodifiableMap(mapaTemporario);
    }

    public List<String> getTodosOsSistemasDisponiveis() {
        return todosOsSistemasDisponiveis;
    }


    public List<String> getItensChecklistParaSistema(String sistema) {
        return itensChecklistPorSistema.getOrDefault(sistema, Collections.emptyList());
    }


    //metodo para a lista final, que armazenara todas as informações
    public List<String> getItensChecklistParaSistemas(List<String> sistemasEscolhidos) {
        List<String> resultadoFinal = new ArrayList<>();


        for (String sistema : sistemasEscolhidos) {
            List<String> itensDoSistema = getItensChecklistParaSistema(sistema);
            resultadoFinal.addAll(itensDoSistema);
        }

        return resultadoFinal;
    }
}
