package br.com.chainResponsability;

import br.com.dominio.Desconto;
import br.com.dominio.Orcamento;

/**
 * Created by root on 1/11/17.
 */
public class CalculadorDesconto {

    public double calcula(Orcamento orcamento) {
        Desconto descontoMaisQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
        Desconto descontoVendaCasada = new DescontoPorVendaCasada();
        Desconto descontoMaisDeCincoItens = new DescontoPorMaisDeCincoItens();
        Desconto semDesconto = new SemDesconto();

        descontoMaisQuinhentosReais.setProximo(descontoVendaCasada);
        descontoVendaCasada.setProximo(descontoMaisDeCincoItens);
        descontoMaisDeCincoItens.setProximo(semDesconto);

        return descontoMaisQuinhentosReais.desconta(orcamento);
    }
}
