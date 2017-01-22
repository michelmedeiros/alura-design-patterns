package br.com.observer;

import br.com.dominio.NotaFiscal;

/**
 * Created by miche on 22/01/2017.
 */
public interface AcaoAposGerarNota {
    public void executa(NotaFiscal nf);
}
