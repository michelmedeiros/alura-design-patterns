package br.com.chainResponsability;

import br.com.dominio.Conta;
import br.com.dominio.Formato;
import br.com.dominio.Requisicao;
import br.com.dominio.Resposta;

/**
 * Created by root on 1/12/17.
 */
public class RespostaCSV implements Resposta{

    private Resposta outraResposta;

    public RespostaCSV() {
    }

    public RespostaCSV(Resposta resposta) {
        this.outraResposta = resposta;
    }

    @Override
    public String responde(Requisicao requisicao, Conta conta) {
        String retorno = null;
        if(Formato.CSV.equals(requisicao.getFormato())) {
            retorno = conta.getTitular() + "," + conta.getSaldo();
        } else {
            outraResposta.responde(requisicao, conta);
        }
        return retorno;
    }

}
