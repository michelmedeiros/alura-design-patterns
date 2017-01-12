package br.com.chainResponsability;

import br.com.dominio.Conta;
import br.com.dominio.Desconto;
import br.com.dominio.Requisicao;
import br.com.dominio.Resposta;

/**
 * Created by root on 1/12/17.
 */
public class ObterResposta {

    public void resposta(Requisicao requisicao, Conta conta) {
        String resposta = new RespostaXML(
                            new RespostaCSV(
                                new RespostaPorcentagem())).responde(requisicao, conta);
        System.out.println(resposta);
    }
}
