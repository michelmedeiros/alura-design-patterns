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
        String respostaXML = new RespostaXML(new RespostaCSV()).responde(requisicao, conta);
        System.out.println(respostaXML);
        String respostaCSV = new RespostaCSV(new RespostaXML()).responde(requisicao, conta);
        System.out.println(respostaCSV);
        String respostaPorcentagem = new RespostaXML().responde(requisicao, conta);
        System.out.println(respostaPorcentagem);
    }
}
