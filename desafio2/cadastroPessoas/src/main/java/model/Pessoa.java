package model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String tipoDeficiencia;
    private Grau grau;
    private String endereco;
    private List<Atendimento> atendimentos = new ArrayList<>();

    public Pessoa(String nome, int idade, String tipoDeficiencia, Grau grau, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grau = grau;
        this.endereco = endereco;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public Grau getGrau() {
        return grau;
    }

    public String getNome() {
        return nome;
    }
}
