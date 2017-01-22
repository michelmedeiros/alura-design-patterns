package br.com.builder;

import br.com.dominio.ItemNota;
import br.com.dominio.NotaFiscal;
import br.com.observer.*;

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
    private List<AcaoAposGerarNota> acoes;

    public NotaFiscalBuilder() {
        this.dataEmissao = LocalDate.now();
        this.acoes = new ArrayList<>();
    }

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

    public NotaFiscalBuilder naData(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    public void adicionaAcao(AcaoAposGerarNota acao) {
        if(!this.acoes.contains(acao)) {
            acoes.add(acao);
        }
    }

    public NotaFiscal constroi() {
       NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, valorBruto, valorImpostos, dataEmissao, observacoes, itensNota);
       for(AcaoAposGerarNota acao: acoes) {
           acao.executa(nf);
       }
       return nf;
    }


}
