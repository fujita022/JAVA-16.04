package futebolFeminino.test;

import futebolFeminino.core.Campeonato;
import futebolFeminino.model.Time;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CampeonatoTest {

    @Test
    void testPontuacaoVitoria() {
        Campeonato c = new Campeonato();
        Time t1 = new Time("A", "SP");
        Time t2 = new Time("B", "RJ");

        c.cadastrarTime(t1);
        c.cadastrarTime(t2);

        c.registrarPartida(t1, 3, t2, 1);

        assertEquals(3, t1.getPontos());
        assertEquals(0, t2.getPontos());
    }

    @Test
    void testPontuacaoEmpate() {
        Campeonato c = new Campeonato();
        Time t1 = new Time("A", "SP");
        Time t2 = new Time("B", "RJ");

        c.registrarPartida(t1, 1, t2, 1);

        assertEquals(1, t1.getPontos());
        assertEquals(1, t2.getPontos());
    }
}
