package model;

public class Veiculo {
    private String placa;
    private TipoVeiculo tipo;
    private int eixos;

    public Veiculo(String placa, TipoVeiculo tipo, int eixos) {
        this.placa = placa;
        this.tipo = tipo;
        this.eixos = eixos;
    }

    public String getPlaca() {
        return placa;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public int getEixos() {
        return eixos;
    }
}
