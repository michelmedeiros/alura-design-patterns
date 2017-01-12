package br.com.chainResponsability;

import br.com.dominio.Conta;
import br.com.dominio.Formato;
import br.com.dominio.Requisicao;
import br.com.dominio.Resposta;

/**
 * Created by root on 1/12/17.
 */
public class RespostaPorcentagem implements Resposta{

    private Resposta outraResposta;

    public RespostaPorcentagem(Resposta resposta) {
        this.outraResposta = resposta;
    }

    public RespostaPorcentagem() {
        this.outraResposta = null;
    }

    @Override
    public String responde(Requisicao requisicao, Conta conta) {
        String retorno = null;
        if(Formato.PORCENTAGEM.equals(requisicao.getFormato())) {
            retorno = conta.getTitular() + "%" + conta.getSaldo();
        } else if(outraResposta != null){
            retorno = this.outraResposta.responde(requisicao, conta);
        } else {
            System.out.println("Formato de resposta não encontrado");
        }
        return retorno;
    }

}
