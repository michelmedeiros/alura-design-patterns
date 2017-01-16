package br.com.templateMethod;

import br.com.dominio.Imposto;
import br.com.dominio.Orcamento;

/**
 * Created by root on 1/16/17.
 */
public class ICPP extends TemplateCondicional {

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
}
