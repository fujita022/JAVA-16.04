package test;

import core.SistemaPessoas;
import model.Atendimento;
import model.Grau;
import model.Pessoa;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaPessoasTest {

    @Test
    void testCadastroPessoa() {
        SistemaPessoas sistema = new SistemaPessoas();
        Pessoa p = new Pessoa("Ana", 40, "Motora", Grau.MODERADO, "Av X");
        sistema.cadastrarPessoa(p);
        assertEquals(1, sistema.filtrarPorGrau(Grau.MODERADO).size());
    }

    @Test
    void testRelatorioAtendimentos() {
        SistemaPessoas sistema = new SistemaPessoas();
        Pessoa p = new Pessoa("Lucas", 22, "Visual", Grau.LEVE, "Rua Z");
        Atendimento a = new Atendimento(LocalDate.now(), "Psicologia", "Dra. Maria");
        p.adicionarAtendimento(a);
        sistema.cadastrarPessoa(p);
        List<Atendimento> atendimentos = sistema.gerarRelatorioAtendimentos("Lucas");
        assertEquals(1, atendimentos.size());
    }
}
