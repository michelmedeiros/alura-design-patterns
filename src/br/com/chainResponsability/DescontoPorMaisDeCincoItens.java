package br.com.chainResponsability;

import java.util.Collections;

import br.com.dominio.Desconto;
import br.com.dominio.Orcamento;

/**
 * Created by root on 1/11/17.
 */
public class DescontoPorMaisDeCincoItens implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        double desconto = 0;
        if(orcamento.getItens().size() > 5) {
            desconto = orcamento.getValor() * 0.1;
            System.out.println("Desconto por mais de cinco itens " + desconto);
        } else {
            desconto = this.proximo.desconta(orcamento);
        }
        return desconto;
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
