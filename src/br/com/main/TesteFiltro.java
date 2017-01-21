package br.com.main;

import br.com.decorator.FiltroMesmoMesAno;
import br.com.decorator.FiltroSaldoMaiorQueQuinhentos;
import br.com.decorator.FiltroSaldoMenorQueCem;
import br.com.dominio.Conta;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

/**
 * Created by miche on 19/01/2017.
 */
public class TesteFiltro {
    public static void main(String[] args) {
        FiltroSaldoMenorQueCem menorQueCem = new FiltroSaldoMenorQueCem(
                new FiltroSaldoMaiorQueQuinhentos(
                        new FiltroMesmoMesAno()));
        Set<Conta> contas = menorQueCem.filtra(
                Arrays.asList(new Conta(800D, LocalDate.now()),
                        new Conta(50D, LocalDate.now()),
                        new Conta(400D, LocalDate.now()),
                        new Conta(200D, LocalDate.now().plusMonths(1L))));
        System.out.println(contas);
    }
}
