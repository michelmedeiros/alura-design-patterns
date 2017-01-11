package br.com.chainResponsability;

import br.com.dominio.Desconto;
import br.com.dominio.Orcamento;

/**
 * Created by root on 1/11/17.
 */
public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        double desconto = 0;
        if(orcamento.getValor() > 500.00) {
            desconto = orcamento.getValor() * 0.07;
            System.out.println("Desconto por mais de 500 reais " + desconto);
        } else {
            desconto = proximo.desconta(orcamento);
        }
        return desconto;
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
