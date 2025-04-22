package test;

import core.SistemaPedagio;
import model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedagioTest {

    @Test
    void testValorCarro() {
        SistemaPedagio sistema = new SistemaPedagio();
        Veiculo carro = new Veiculo("AAA1111", TipoVeiculo.CARRO, 0);
        PracaPedagio praca = new PracaPedagio("Anhanguera", 12.0);
        assertEquals(12.0, sistema.calcularValor(carro, praca));
    }

    @Test
    void testValorMoto() {
        SistemaPedagio sistema = new SistemaPedagio();
        Veiculo moto = new Veiculo("BBB2222", TipoVeiculo.MOTO, 0);
        PracaPedagio praca = new PracaPedagio("Anhanguera", 12.0);
        assertEquals(6.0, sistema.calcularValor(moto, praca));
    }

    @Test
    void testValorCaminhao() {
        SistemaPedagio sistema = new SistemaPedagio();
        Veiculo caminhao = new Veiculo("CCC3333", TipoVeiculo.CAMINHAO, 5);
        PracaPedagio praca = new PracaPedagio("Anhanguera", 12.0);
        assertEquals(60.0, sistema.calcularValor(caminhao, praca));
    }

    @Test
    void testTotalPorPraca() {
        SistemaPedagio sistema = new SistemaPedagio();
        PracaPedagio praca = new PracaPedagio("Anhanguera", 10.0);
        sistema.registrarPassagem(new Veiculo("X1", TipoVeiculo.CARRO, 0), praca);
        sistema.registrarPassagem(new Veiculo("X2", TipoVeiculo.MOTO, 0), praca);
        sistema.registrarPassagem(new Veiculo("X3", TipoVeiculo.CAMINHAO, 3), praca);
        assertEquals(10 + 5 + 30, sistema.valorTotalPorPraca(praca));
    }
}
