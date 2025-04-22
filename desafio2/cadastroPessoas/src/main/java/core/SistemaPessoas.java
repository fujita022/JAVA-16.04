package core;

import model.Atendimento;
import model.Grau;
import model.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaPessoas {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public List<Pessoa> filtrarPorDeficiencia(String tipo) {
        return pessoas.stream()
                .filter(p -> p.getTipoDeficiencia().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pessoa> filtrarPorGrau(Grau grau) {
        return pessoas.stream()
                .filter(p -> p.getGrau() == grau)
                .collect(Collectors.toList());
    }

    public List<Atendimento> gerarRelatorioAtendimentos(String nome) {
        return pessoas.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .map(Pessoa::getAtendimentos)
                .orElse(new ArrayList<>());
    }
}
