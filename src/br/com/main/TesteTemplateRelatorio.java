package br.com.main;

import br.com.dominio.Banco;
import br.com.dominio.Conta;
import br.com.dominio.Item;
import br.com.dominio.Relatorio;
import br.com.estrategy.CalculadoraImposto;
import br.com.templateMethod.IHIT;
import br.com.templateMethod.RelatorioComplexo;
import br.com.templateMethod.RelatorioSimples;

import java.util.Arrays;

/**
 * Created by michel on 09/01/17.
 */
public class TesteTemplateRelatorio {

    public static void main(String[] args) {
        Banco banco = new Banco("BBSA", "31 2233-3333", "Rua do Sol 3000", "atendimentobb@banco.com.br");
        Conta conta = new Conta(200, "Michel", banco, "1234-1", "2322");
        System.out.println(">>>>Relatório Simples>>>>>>>>>");
        new RelatorioSimples().imprime(banco, Arrays.asList(conta));
        System.out.println(">>>>Relatório Complexo>>>>>>>>>");
        new RelatorioComplexo().imprime(banco, Arrays.asList(conta));
    }

}
