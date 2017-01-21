package br.com.state;

import br.com.dominio.Orcamento;

/**
 * Created by miche on 21/01/2017.
 */
public class Aprovado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        double desconto = orcamento.getValor() * 0.02;
        orcamento.setValor(orcamento.getValor() - desconto);
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento já se encontra aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento já se encontra aprovado e não pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }

}
