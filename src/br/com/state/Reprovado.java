package br.com.state;

import br.com.dominio.Orcamento;

/**
 * Created by miche on 21/01/2017.
 */
public class Reprovado implements EstadoOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamento reprovado não pode ter desconto");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento se encontra reprovado e não pode ser aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento já se encontra reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
