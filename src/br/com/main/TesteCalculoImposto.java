package br.com.main;

import br.com.dominio.Banco;
import br.com.dominio.Conta;
import br.com.dominio.Orcamento;
import br.com.estrategy.*;

/**
 * Created by michel on 09/01/17.
 */
public class TesteCalculoImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(200.00);
        new CalculadoraImposto().calclarImposto(orcamento, new ICCC());

        new ICCC().calcula(orcamento);

        System.out.println("Conservador");
        new RealizadorDeInvestimentos().realizaInvestimento(new Conta(100, "José", new Banco("BB"), "123", "456"), new Conservador());
        System.out.println("Moderado");
        new RealizadorDeInvestimentos().realizaInvestimento(new Conta(100, "Maria", new Banco("BB"), "123", "456"), new Moderado());
        System.out.println("Arrojado");
        new RealizadorDeInvestimentos().realizaInvestimento(new Conta(100, "Pedro", new Banco("BB"), "123", "456"), new Arrojado());


    }

}
