package br.com.main;

import br.com.chainResponsability.CalculadorDesconto;
import br.com.dominio.Item;
import br.com.dominio.Orcamento;

/**
 * Created by michel on 09/01/17.
 */
public class TesteCalculoDesconto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(500.00);
        orcamento.adicionaItens(new Item("Caneta", 10.00));
        orcamento.adicionaItens(new Item("Lapis", 20.00));
        orcamento.adicionaItens(new Item("Caderno", 50.00));
        orcamento.adicionaItens(new Item("Borracha", 5.00));
        orcamento.adicionaItens(new Item("Lapiseira", 15.00));
        orcamento.adicionaItens(new Item("Mochila", 400.00));
        CalculadorDesconto calculadorDesconto =  new CalculadorDesconto();

        double desconto = calculadorDesconto.calcula(orcamento);

        System.out.println("Desconto");
        System.out.println(desconto);


    }

}
