package br.com.estrategy;

import br.com.dominio.Imposto;
import br.com.dominio.Orcamento;

/**
 * Created by michel on 09/01/17.
 */
public class CalculadoraImposto {

    public double calclarImposto(Orcamento orcamento, Imposto imposto) {
        double valor =  imposto.calcula(orcamento);
        System.out.println(valor);
        return valor;
    }
}
