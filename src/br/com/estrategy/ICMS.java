package br.com.estrategy;

import br.com.dominio.Imposto;
import br.com.dominio.Orcamento;

/**
 * Created by michel on 09/01/17.
 */
public class ICMS implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
