package br.com.state;

import br.com.dominio.Orcamento;

/**
 * Created by miche on 21/01/2017.
 */
public class Finalizado implements EstadoOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamento finalizado não pode ter desconto");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento se encontra finalizado e não pode ser aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orcamento se encontra finalizado e não pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orcamento já se encontra finalizado");
    }
}
