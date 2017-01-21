package br.com.main;

import br.com.dominio.Orcamento;

/**
 * Created by miche on 21/01/2017.
 */
public class TesteDescontoExtra {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(100D);
        orcamento.aplicaDescontoExtra();
        System.out.println(orcamento.getValor());

        orcamento.getEstadoAtual().aprova(orcamento);
        orcamento.aplicaDescontoExtra();
        System.out.println(orcamento.getValor());

        orcamento.getEstadoAtual().finaliza(orcamento);

        orcamento.getEstadoAtual().reprova(orcamento);
    }
}
