package br.com.decorator;

import br.com.dominio.Conta;

import java.util.*;

/**
 * Created by miche on 20/01/2017.
 */
public abstract class Filtro {

    protected final Filtro outroFiltro;

    protected Filtro() {
        this.outroFiltro = null;
    }

    protected Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public abstract Set<Conta> filtra(List<Conta> contas);

    protected Set<Conta> proximo(List<Conta> contas) {
        return outroFiltro != null ? outroFiltro.filtra(contas) : new HashSet<>();
    }

}
