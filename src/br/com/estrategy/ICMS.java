package br.com.estrategy;

import br.com.dominio.Imposto;
import br.com.dominio.Orcamento;

/**
 * Created by michel on 09/01/17.
 */
public class ICMS extends Imposto {


    public ICMS() {
        super();
    }

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + super.calculaOutroImposto(orcamento);
    }
}
