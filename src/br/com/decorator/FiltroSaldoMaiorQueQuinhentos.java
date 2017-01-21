package br.com.decorator;

import br.com.dominio.Conta;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by miche on 20/01/2017.
 */
public class FiltroSaldoMaiorQueQuinhentos extends Filtro {

    public FiltroSaldoMaiorQueQuinhentos(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroSaldoMaiorQueQuinhentos() {
        super();
    }
    @Override
    public Set<Conta> filtra(List<Conta> contas) {
        Set<Conta> contasFiltradas = new HashSet<>();
        contasFiltradas =  contas.stream().filter(conta -> conta.getSaldo() > 500D).collect(Collectors.toSet());
        contasFiltradas.addAll(proximo(contas));
        return contasFiltradas;
    }



}
