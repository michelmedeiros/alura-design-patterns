package br.com.builder;

import br.com.dominio.ItemNota;

/**
 * Created by miche on 22/01/2017.
 */
public class ItemNotaFiscalBuilder {

    private String descricao;
    private double valor;

    public ItemNotaFiscalBuilder comDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ItemNotaFiscalBuilder comValor(double valor) {
        this.valor = valor;
        return this;
    }

    public ItemNota constroi() {
        return new ItemNota(descricao, valor);
    }
}
