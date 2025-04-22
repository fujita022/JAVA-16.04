package app;

import core.SistemaPessoas;
import model.Atendimento;
import model.Grau;
import model.Pessoa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SistemaPessoas sistema = new SistemaPessoas();

        Pessoa p1 = new Pessoa("Joana", 30, "Visual", Grau.LEVE, "Rua A");
        Pessoa p2 = new Pessoa("Carlos", 25, "Auditiva", Grau.MODERADO, "Rua B");

        sistema.cadastrarPessoa(p1);
        sistema.cadastrarPessoa(p2);

        p1.adicionarAtendimento(new Atendimento(LocalDate.now(), "Fisioterapia", "Dr. Silva"));

        for (Pessoa p : sistema.filtrarPorGrau(Grau.LEVE)) {
            System.out.println(p.getNome());
        }
    }
}
