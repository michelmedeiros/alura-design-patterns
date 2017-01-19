package br.com.dominio;

import java.util.List;

/**
 * Created by miche on 18/01/2017.
 */
public interface Relatorio {
    void imprime(Banco banco, List<Conta> contas);
}
