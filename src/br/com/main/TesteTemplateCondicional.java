package br.com.main;

import br.com.dominio.Item;
import br.com.dominio.Orcamento;
import br.com.estrategy.CalculadoraImposto;
import br.com.templateMethod.IHIT;

/**
 * Created by michel on 09/01/17.
 */
public class TesteTemplateCondicional {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(200.00);
        orcamento.adicionaItens(new Item("LAPIS", 50));
        orcamento.adicionaItens(new Item("LAPIS", 50));
        orcamento.adicionaItens(new Item("CANETA", 50));
        orcamento.adicionaItens(new Item("BORRACHA", 50));
        new CalculadoraImposto().calclarImposto(orcamento, new IHIT());
    }

}
