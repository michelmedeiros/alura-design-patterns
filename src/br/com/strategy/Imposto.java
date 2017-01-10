package br.com.strategy;

import br.com.dominio.Orcamento;

public interface Imposto {
    double calcula(Orcamento orcamento);
}
