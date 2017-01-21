package br.com.decorator;

import br.com.dominio.Conta;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by miche on 20/01/2017.
 */
public class FiltroSaldoMenorQueCem extends Filtro {

    public FiltroSaldoMenorQueCem(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroSaldoMenorQueCem() {
        super();
    }

    @Override
    public Set<Conta> filtra(List<Conta> contas) {
        Set<Conta> contasFiltradas = new HashSet<>();
        contasFiltradas =  contas.stream().filter(conta -> conta.getSaldo() < 100D).collect(Collectors.toSet());
        contasFiltradas.addAll(proximo(contas));
        return contasFiltradas;
    }
}
