package br.com.estrategy;

import br.com.dominio.Imposto;
import br.com.dominio.Orcamento;

/**
 * Created by michel on 09/01/17.
 */
public class ICCC extends Imposto{


    public ICCC() {
        super();
    }

    public ICCC(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        double valor = orcamento.getValor();
        if(orcamento.getValor() < 1000) {
            valor = valor * 0.05;
        } else if(orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
            valor = valor * 0.05;
        } else {
            valor = valor * 0.08 + 30;
        }
        return valor + super.calculaOutroImposto(orcamento);
    }
}

