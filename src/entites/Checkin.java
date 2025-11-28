package entites;

import java.time.LocalDateTime;

public class Checkin {

    private String nome;
    private LocalDateTime dataDaInspecao;
    private String placa;

    public Checkin(String nome, LocalDateTime dataDaInspecao, String placa) {
        this.nome = nome;
        this.dataDaInspecao = LocalDateTime.now();
        this.placa = placa;
    }


    public Checkin() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\n===DADOS DO CHECK-UP:==="
                + "\nNome do tecnico responsavel: " + nome
                + "\nData da inspecao: " + dataDaInspecao
                + "\nPlaca do veiculo a ser inspecionado: " + placa;
    }
}
