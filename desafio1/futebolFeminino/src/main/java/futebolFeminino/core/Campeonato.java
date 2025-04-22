package futebolFeminino.core;

import futebolFeminino.model.Time;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Campeonato {
    private List<Time> times = new ArrayList<>();

    public void cadastrarTime(Time time) {
        times.add(time);
    }

    public void registrarPartida(Time t1, int g1, Time t2, int g2) {
        if (g1 > g2) t1.adicionarPontos(3);
        else if (g1 < g2) t2.adicionarPontos(3);
        else {
            t1.adicionarPontos(1);
            t2.adicionarPontos(1);
        }
    }

    public List<Time> getClassificacao() {
        times.sort(Comparator.comparingInt(Time::getPontos).reversed());
        return times;
    }
}
