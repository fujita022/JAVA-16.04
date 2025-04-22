package futebolFeminino.model;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private List<Jogadora> jogadoras = new ArrayList<>();
    private int pontos;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void adicionarJogadora(Jogadora j) {
        jogadoras.add(j);
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }
}
