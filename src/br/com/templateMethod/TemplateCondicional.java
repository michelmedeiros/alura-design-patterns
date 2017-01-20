package br.com.templateMethod;

import br.com.dominio.Imposto;
import br.com.dominio.Orcamento;

/**
 * Created by root on 1/16/17.
 */
public abstract class TemplateCondicional extends Imposto {

    public TemplateCondicional() {
        super();
    }

    public TemplateCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
