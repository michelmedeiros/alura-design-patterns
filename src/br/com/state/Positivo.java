package br.com.state;

import br.com.dominio.Conta;

/**
 * Created by miche on 21/01/2017.
 */
public class Positivo implements EstadoConta {

    @Override
    public void saca(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() - valor);
        if(conta.getSaldo() < 0) {
            conta.setEstadoConta(new Negativo());
        }
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + (valor * 0.98));
    }
}
