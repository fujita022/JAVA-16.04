package app;

import core.SistemaPedagio;
import model.*;

public class Main {
    public static void main(String[] args) {
        SistemaPedagio sistema = new SistemaPedagio();

        PracaPedagio praca = new PracaPedagio("Castelo Branco", 10.0);
        Veiculo carro = new Veiculo("ABC1234", TipoVeiculo.CARRO, 0);
        Veiculo moto = new Veiculo("XYZ5678", TipoVeiculo.MOTO, 0);
        Veiculo caminhao = new Veiculo("DEF0000", TipoVeiculo.CAMINHAO, 4);

        sistema.registrarPassagem(carro, praca);
        sistema.registrarPassagem(moto, praca);
        sistema.registrarPassagem(caminhao, praca);

        System.out.println("Valor arrecadado na praça: R$" + sistema.valorTotalPorPraca(praca));
    }
}
