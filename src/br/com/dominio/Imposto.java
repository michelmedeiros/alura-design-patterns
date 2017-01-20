package br.com.dominio;

public abstract class Imposto {

    protected final Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {
        this.outroImposto = null;
    }
    public abstract double calcula(Orcamento orcamento);

    protected double calculaOutroImposto(Orcamento orcamento) {
        double valor = this.outroImposto == null ? 0 : outroImposto.calcula(orcamento);
        return valor;
    }
}
