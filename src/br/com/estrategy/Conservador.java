package br.com.estrategy;

import br.com.dominio.Conta;
import br.com.dominio.Investimento;

/**
 * Created by michel on 09/01/17.
 */
public class Conservador implements Investimento {
    @Override
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.008;
    }
}
