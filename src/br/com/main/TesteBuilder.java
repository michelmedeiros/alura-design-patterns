package br.com.main;

import br.com.builder.NotaFiscalBuilder;
import br.com.dominio.ItemNota;
import br.com.dominio.NotaFiscal;

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
            .naDataAtual()
            .constroi();
        System.out.println(nota);
    }

}
