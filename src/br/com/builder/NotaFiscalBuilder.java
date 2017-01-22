package br.com.builder;

import br.com.dominio.ItemNota;
import br.com.dominio.NotaFiscal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by miche on 22/01/2017.
 */
public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemNota> itensNota = new ArrayList<>();
    private double valorBruto;
    private double valorImpostos;
    private String observacoes;
    private LocalDate dataEmissao;


    public NotaFiscalBuilder comEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemNota item) {
        this.itensNota.add(item);
        valorBruto += item.getValor();
        valorImpostos += item.getValor() * 0.05;
        return this;
    }


    public NotaFiscalBuilder comObservacoes(String obs) {
        this.observacoes = obs;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.dataEmissao = LocalDate.now();
        return this;
    }

    public NotaFiscal constroi() {
       return new NotaFiscal(razaoSocial, cnpj, valorBruto, valorImpostos, dataEmissao, observacoes, itensNota);
    }
}
