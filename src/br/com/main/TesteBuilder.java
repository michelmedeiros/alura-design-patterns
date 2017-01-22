package br.com.main;

import br.com.builder.ItemNotaFiscalBuilder;
import br.com.builder.NotaFiscalBuilder;
import br.com.dominio.ItemNota;
import br.com.dominio.NotaFiscal;

import java.time.LocalDate;

import static java.time.Month.JANUARY;

/**
 * Created by miche on 22/01/2017.
 */
public class TesteBuilder {

    public static void main(String[] args) {
        NotaFiscalBuilder notaFiscalBuilder = new NotaFiscalBuilder();
        NotaFiscal nota = notaFiscalBuilder.comEmpresa("Empresa teste")
            .comCnpj("1223444444")
            .comItem(new ItemNota("Produto Teste", 100D))
            .comItem(new ItemNota("Produto Teste 2", 200D))
            .comItem(new ItemNota("Produto Teste 3", 300D))
            .comObservacoes("Teste observacoes")
            .constroi();
        System.out.println(nota);


        ItemNotaFiscalBuilder itemNotaFiscalBuilder = new ItemNotaFiscalBuilder();
        ItemNota item = itemNotaFiscalBuilder
                .comDescricao("Teste item Builder")
                .comValor(190D)
                .constroi();
        NotaFiscal notaComItemBuilder = notaFiscalBuilder.comEmpresa("Empresa teste sem item")
                .comCnpj("1223444444")
                .comObservacoes("Teste observacoes sem item")
                .comItem(item)
                .naData(LocalDate.of(2017, JANUARY, 1))
                .constroi();

        System.out.println(notaComItemBuilder);
    }

}
