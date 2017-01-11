package br.com.dominio;

/**
 * Created by root on 1/11/17.
 */
public class Item {

    private String nome;
    private double valor;


    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
