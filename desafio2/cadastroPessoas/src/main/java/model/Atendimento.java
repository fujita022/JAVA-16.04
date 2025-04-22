package model;

import java.time.LocalDate;

public class Atendimento {
    private LocalDate data;
    private String tipo;
    private String profissional;

    public Atendimento(LocalDate data, String tipo, String profissional) {
        this.data = data;
        this.tipo = tipo;
        this.profissional = profissional;
    }

    public LocalDate getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProfissional() {
        return profissional;
    }
}
