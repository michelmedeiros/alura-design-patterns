package br.com.observer;

import br.com.dominio.NotaFiscal;

/**
 * Created by miche on 22/01/2017.
 */
public class EnviaPorSMS implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Envia por SMS");
    }
}

