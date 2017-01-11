package br.com.dominio;

/**
 * Created by root on 1/11/17.
 */
public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}
