package br.com.chainResponsability;

import br.com.dominio.Desconto;
import br.com.dominio.Orcamento;

/**
 * Created by root on 1/11/17.
 */
public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto desconto) {
        System.out.println("Não existe próximo desconto");
    }
}
