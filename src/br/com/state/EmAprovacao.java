package br.com.state;

import br.com.dominio.Orcamento;

/**
 * Created by miche on 21/01/2017.
 */
public class EmAprovacao implements EstadoOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(orcamento.isDescontoAplicado()) {
            throw new RuntimeException("Desconto já aplicado ao orçamento");
        }

        double desconto = orcamento.getValor() * 0.05;
        orcamento.setValor(orcamento.getValor() - desconto);
        orcamento.setDescontoAplicado(true);
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
    }
}
