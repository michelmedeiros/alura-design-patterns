package br.com.decorator;

import br.com.dominio.Conta;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by miche on 20/01/2017.
 */
public class FiltroMesmoMesAno extends Filtro {

    public FiltroMesmoMesAno(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroMesmoMesAno() {
        super();
    }
    @Override
    public Set<Conta> filtra(List<Conta> contas) {
        Set<Conta> contasFiltradas = new HashSet<>();
        contasFiltradas =  contas.stream().filter(conta ->
                conta.getDataAbertura().getMonth().equals(LocalDate.now().getMonth())
                    && conta.getDataAbertura().getYear() == LocalDate.now().getYear())
                        .collect(Collectors.toSet());
        contasFiltradas.addAll(proximo(contas));
        return contasFiltradas;
    }



}
