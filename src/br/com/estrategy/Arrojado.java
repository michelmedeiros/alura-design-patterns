package br.com.estrategy;

import br.com.dominio.Conta;
import br.com.dominio.Investimento;

import java.util.Random;

/**
 * Created by michel on 09/01/17.
 */
public class Arrojado implements Investimento{
    @Override
    public double calcula(Conta conta) {
        int percentual = new Random().nextInt(10);
        if(percentual >= 0 && percentual <= 1) {
            return conta.getSaldo() * 0.5;
        } else if(percentual >= 2 && percentual <= 4) {
            return conta.getSaldo() * 0.3;
        }else {
            return conta.getSaldo() * 0.006;
        }
    }
}

