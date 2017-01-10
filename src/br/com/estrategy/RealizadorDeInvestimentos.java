package br.com.estrategy;

import br.com.dominio.Conta;
import br.com.dominio.Investimento;

/**
 * Created by michel on 09/01/17.
 */
public class RealizadorDeInvestimentos {
    public double realizaInvestimento(Conta conta, Investimento investimento) {
        double rendimento =  investimento.calcula(conta) * 0.75;
        conta.deposita(rendimento);
        System.out.println ( "Novo saldo: " + conta.getSaldo());
        return rendimento;
    }
}

