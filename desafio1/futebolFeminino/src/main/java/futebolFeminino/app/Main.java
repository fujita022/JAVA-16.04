package futebolFeminino.app;

import futebolFeminino.core.Campeonato;
import futebolFeminino.model.Time;

public class Main {
    public static void main(String[] args) {
        Campeonato c = new Campeonato();

        Time t1 = new Time("FIAP Girls", "São Paulo");
        Time t2 = new Time("Tech Stars", "Campinas");

        c.cadastrarTime(t1);
        c.cadastrarTime(t2);

        c.registrarPartida(t1, 2, t2, 1);

        c.getClassificacao().forEach(t -> 
            System.out.println(t.getNome() + " - " + t.getPontos() + " pontos")
        );
    }
}
