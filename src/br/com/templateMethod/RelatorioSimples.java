package br.com.templateMethod;

import br.com.dominio.Banco;
import br.com.dominio.Conta;

import java.util.List;

/**
 * Created by miche on 18/01/2017.
 */

public class RelatorioSimples extends TemplateRelatorio  {

    @Override
    protected void imprimeCabecalho(Banco banco) {
        System.out.println(">>>>CABEÇALHO>>>>>>>>>");
        System.out.println("Banco " + banco.getNome());
        System.out.println("Telefone " + banco.getTelefone());

    }

    @Override
    protected void imprimeCorpo(List<Conta> contas) {
        System.out.println(">>>>CORPO>>>>>>>>>");
        contas.forEach(conta -> {
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: " + conta.getSaldo());
        });
    }

    @Override
    protected void imprimeRodape(Banco banco) {
        System.out.println(">>>>RODAPÉ>>>>>>>>>");
        System.out.println("Banco " + banco.getNome());
        System.out.println("Telefone " + banco.getTelefone());
    }
}
