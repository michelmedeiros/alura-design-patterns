package br.com.decorator;

import br.com.dominio.Imposto;
import br.com.dominio.Orcamento;

/**
 * Created by miche on 19/01/2017.
 */
public class IMA extends Imposto {

    public IMA() {
        super();
    }

    public IMA(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
    }
}
