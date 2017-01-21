package br.com.state;

import br.com.dominio.Orcamento;

/**
 * Created by miche on 21/01/2017.
 */
public interface EstadoOrcamento {

    void aplicaDescontoExtra(Orcamento orcamento);

    void aprova(Orcamento orcamento);

    void reprova(Orcamento orcamento);

    void finaliza(Orcamento orcamento);
}
