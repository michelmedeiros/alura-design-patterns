package br.com.estrategy;

import br.com.dominio.Conta;
import br.com.dominio.Investimento;

/**
 * Created by michel on 09/01/17.
 */
public class Moderado implements Investimento {
    @Override
    public double calcula(Conta conta) {
        boolean escolhido = new java.util.Random().nextInt(2) == 0;
        if(escolhido) {
            return conta.getSaldo() * 0.025;
        }else {
            return conta.getSaldo() * 0.007;
        }

    }
}
