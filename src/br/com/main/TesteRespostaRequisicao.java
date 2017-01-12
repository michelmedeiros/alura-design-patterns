package br.com.main;

import br.com.chainResponsability.ObterResposta;
import br.com.dominio.Conta;
import br.com.dominio.Formato;
import br.com.dominio.Requisicao;

/**
 * Created by root on 1/12/17.
 */
public class TesteRespostaRequisicao {
    public static void main(String[] args) {
        new ObterResposta().resposta(new Requisicao(Formato.XML), new Conta(100, "José"));
        new ObterResposta().resposta(new Requisicao(Formato.CSV), new Conta(100, "Maria"));
        new ObterResposta().resposta(new Requisicao(Formato.PORCENTAGEM), new Conta(100, "Pedro"));
    }
}
