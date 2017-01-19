package br.com.templateMethod;

import br.com.dominio.Banco;
import br.com.dominio.Conta;
import br.com.dominio.Relatorio;

import java.util.List;

/**
 * Created by miche on 18/01/2017.
 */
public abstract class TemplateRelatorio implements Relatorio {

    @Override
    public final void imprime(Banco banco, List<Conta> contas) {
        imprimeCabecalho(banco);
        imprimeCorpo(contas);
        imprimeRodape(banco);
    }

    protected abstract void imprimeCabecalho(Banco banco);
    protected abstract void imprimeCorpo(List<Conta> contas);
    protected abstract void imprimeRodape(Banco banco);
}
