package aulas.oo.part04.exemploEquals.exemplo001;

import java.util.Objects;

public abstract class Veiculo {

    private String modelo;
    private String marca;

    private double valorVenal;

    public Veiculo(String modelo, String marca, double valorVenal) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorVenal = valorVenal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void acelera() {
        System.out.println("Acelerando...");
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public double calculaImposto() {
        return this.valorVenal * 0.01;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo)) return false;
        Veiculo veiculo = (Veiculo) o;
        return Double.compare(veiculo.valorVenal, valorVenal) == 0 &&
                modelo.equals(veiculo.modelo) &&
                marca.equals(veiculo.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca, valorVenal);
    }
}
