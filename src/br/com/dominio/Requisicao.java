package br.com.dominio;

/**
 * Created by root on 1/12/17.
 */
public class Requisicao {

    private Formato formato;

    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }
}
