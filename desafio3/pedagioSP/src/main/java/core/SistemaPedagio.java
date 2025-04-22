package core;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaPedagio {
    private List<RegistroPassagem> registros = new ArrayList<>();

    public double calcularValor(Veiculo veiculo, PracaPedagio praca) {
        return switch (veiculo.getTipo()) {
            case CARRO -> praca.getTarifaBase();
            case MOTO -> praca.getTarifaBase() * 0.5;
            case CAMINHAO -> praca.getTarifaBase() * veiculo.getEixos();
        };
    }

    public void registrarPassagem(Veiculo veiculo, PracaPedagio praca) {
        double valor = calcularValor(veiculo, praca);
        registros.add(new RegistroPassagem(veiculo, praca, valor));
    }

    public double valorTotalPorPraca(PracaPedagio praca) {
        return registros.stream()
                .filter(r -> r.getPraca().equals(praca))
                .mapToDouble(RegistroPassagem::getValorCobrado)
                .sum();
    }

    public List<RegistroPassagem> getRegistros() {
        return registros;
    }
}
