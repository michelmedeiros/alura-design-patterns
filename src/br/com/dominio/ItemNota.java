package br.com.dominio;

/**
 * Created by miche on 22/01/2017.
 */
public class ItemNota {

    private String descricao;
    private double valor;

    public ItemNota(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
