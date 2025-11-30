package com.vargatech.checkout.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Inspecao {

    private String nome;
    private LocalDateTime dataDaInspecao;
    private String placa;

List<String> sistemas = new ArrayList<>();


sistemas.add("motor");
sistemas.add("suspensao");
sistemas.add("freio");
sistemas.add("cambio");
sistemas.add("arrefecimento");

sout.println(sistemas);

}
