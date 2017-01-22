package br.com.state;

import br.com.dominio.Conta;
import br.com.dominio.Orcamento;

/**
 * Created by miche on 21/01/2017.
 */
public interface EstadoConta {

    void saca(Conta conta, double valor);

    void deposita(Conta conta, double valor);
}
