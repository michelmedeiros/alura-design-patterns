package br.com.templateMethod;

import br.com.dominio.Imposto;
import br.com.dominio.Orcamento;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by root on 1/16/17.
 */
public class IKCV extends TemplateCondicional {

    public IKCV() {
        super();
    }

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        return orcamento.getItens().stream().anyMatch(item -> item.getValor() > 100);
    }
}
