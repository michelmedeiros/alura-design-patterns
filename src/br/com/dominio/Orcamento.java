package br.com.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by michel on 09/01/17.
 */
public class Orcamento {

    private double valor;

    private List<Item> itens;

    public Orcamento(double valor) {
        this.valor  = valor;
        this.itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItens(Item item) {
        itens.add(item);
    }
}
