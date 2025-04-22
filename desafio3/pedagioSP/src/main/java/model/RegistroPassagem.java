package model;

public class RegistroPassagem {
    private Veiculo veiculo;
    private PracaPedagio praca;
    private double valorCobrado;

    public RegistroPassagem(Veiculo veiculo, PracaPedagio praca, double valorCobrado) {
        this.veiculo = veiculo;
        this.praca = praca;
        this.valorCobrado = valorCobrado;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public PracaPedagio getPraca() {
        return praca;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }
}
