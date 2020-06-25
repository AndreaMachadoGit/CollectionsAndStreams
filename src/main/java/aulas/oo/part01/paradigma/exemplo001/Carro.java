package aulas.oo.part01.paradigma.exemplo001;

public class Carro {


    private String modelo;
    private int numeroPessoasNoCarro;

    public Carro(String modelo, int numeroPessoasNoCarro) {
        this.modelo = modelo;
        this.numeroPessoasNoCarro = numeroPessoasNoCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPessoasNoCarro() {
        return numeroPessoasNoCarro;
    }

    public void setNumeroPessoasNoCarro(int numeroPessoasNoCarro) {
        this.numeroPessoasNoCarro = numeroPessoasNoCarro;
    }

    public String incluirPessoasNoCarro() {
        setNumeroPessoasNoCarro(getNumeroPessoasNoCarro()+1);
        return (getNumeroPessoasNoCarro() + " pessoas.");
    }

    public String removerPessoasDoCarro() {
        setNumeroPessoasNoCarro(getNumeroPessoasNoCarro()-1);
        return (getNumeroPessoasNoCarro() + " pessoas.");
    }

}
