package com.vargatech.checkout.model;

public class SistemasIntervidos {

    private String motor;
    private String suspensao;
    private String freio;
    private String cambio;
    private String arrefecimento;
    private String injecaoEletronica;
    private String abs;
    private String airbag;

    public SistemasIntervidos() {
    }

    public SistemasIntervidos(String motor, String suspensao, String freio, String cambio, String arrefecimento, String injecaoEletronica, String abs, String airbag) {
        this.motor = motor;
        this.suspensao = suspensao;
        this.freio = freio;
        this.cambio = cambio;
        this.arrefecimento = arrefecimento;
        this.injecaoEletronica = injecaoEletronica;
        this.abs = abs;
        this.airbag = airbag;
    }
}
