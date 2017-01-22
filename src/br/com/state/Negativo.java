package br.com.state;

import br.com.dominio.Conta;

/**
 * Created by miche on 21/01/2017.
 */
public class Negativo implements EstadoConta {
    @Override
    public void saca(Conta conta, double valor) {
        throw new RuntimeException("Não é possível realizar saque em conta em vermelho");
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + (valor * 0.95));
        if(conta.getSaldo() > 0) {
            conta.setEstadoConta(new Positivo());
        }
    }
}
