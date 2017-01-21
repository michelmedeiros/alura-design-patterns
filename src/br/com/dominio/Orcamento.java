package br.com.dominio;

import br.com.state.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by michel on 09/01/17.
 */
public class Orcamento {

    private double valor;

    private List<Item> itens;

    private EstadoOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor  = valor;
        this.estadoAtual = new EmAprovacao();
        this.itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public EstadoOrcamento getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoOrcamento estadoAtual) {
        this.estadoAtual = estadoAtual;
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

    public void aplicaDescontoExtra() {
        this.estadoAtual.aplicaDescontoExtra(this);
    }
}
