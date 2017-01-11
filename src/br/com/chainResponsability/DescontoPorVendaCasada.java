package br.com.chainResponsability;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.dominio.Desconto;
import br.com.dominio.Item;
import br.com.dominio.Orcamento;

/**
 * Created by root on 1/11/17.
 */
public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        double desconto = 0;
        if(existeVendaCasada(orcamento)) {
            desconto = orcamento.getValor() * 0.05;
            System.out.println("Desconto venda casada " + desconto);
        } else {
            desconto = this.proximo.desconta(orcamento);
        }
        return desconto;
    }

    private boolean existeVendaCasada(Orcamento orcamento) {
        Set<String> itens =  orcamento.getItens().stream().map(Item :: getNome).collect(Collectors.toSet());
        return itens.containsAll(Arrays.asList("Lapis", "Caneta"));
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
