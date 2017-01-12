package br.com.chainResponsability;

import br.com.dominio.Conta;
import br.com.dominio.Formato;
import br.com.dominio.Requisicao;
import br.com.dominio.Resposta;

/**
 * Created by root on 1/12/17.
 */
public class RespostaXML implements Resposta{

    private Resposta resposta;

    public RespostaXML() {
    }

    public RespostaXML(Resposta resposta) {
        this.resposta = resposta;
    }

    @Override
    public String responde(Requisicao requisicao, Conta conta) {
        String retorno = null;
        if(Formato.XML.equals(requisicao.getFormato())) {
            retorno = "<conta><titular>" + conta.getTitular() + "</titular><saldo>"
            + conta.getSaldo() + "</saldo></conta>";
        } else {
            retorno = this.resposta.responde(requisicao, conta);
        }
        return retorno;
    }
}
