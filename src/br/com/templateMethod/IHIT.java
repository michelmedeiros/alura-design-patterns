package br.com.templateMethod;

import java.util.Map;
import java.util.stream.Collectors;

import com.sun.org.apache.xpath.internal.operations.Or;

import br.com.dominio.Orcamento;

/**
 * Created by root on 1/16/17.
 */
public class IHIT extends TemplateCondicional {
    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        double percentual = 0.01 * orcamento.getItens().size();
        return orcamento.getValor() * percentual;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return temDoisItemComMesmoNome(orcamento);
    }

    private boolean temDoisItemComMesmoNome(Orcamento orcamento) {
        Map<String, Long> counts =
                orcamento.getItens().stream().collect(Collectors.groupingBy(
                        item -> item.getNome(), Collectors.counting()));
        return counts.containsValue(2L);
    }
}
