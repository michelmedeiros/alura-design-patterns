package br.com.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by miche on 22/01/2017.
 */
public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private double valorImpostos;
    private LocalDate dataEmissao;
    private String observacoes;
    private List<ItemNota> itens;


    public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, double valorImpostos, LocalDate dataEmissao, String observacoes, List<ItemNota> itens) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.valorBruto = valorBruto;
        this.valorImpostos = valorImpostos;
        this.dataEmissao = dataEmissao;
        this.observacoes = observacoes;
        this.itens = itens;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getValorImpostos() {
        return valorImpostos;
    }

    public void setValorImpostos(double valorImpostos) {
        this.valorImpostos = valorImpostos;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<ItemNota> getItens() {
        return itens;
    }

    public void setItens(List<ItemNota> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Razão Social: " + this.razaoSocial + "\n" +
        "Cnpj: " + this.cnpj + "\n" +
        "Observacoes: " + this.observacoes + "\n" +
        "Data Emissão: " + this.dataEmissao.format(DateTimeFormatter.ISO_LOCAL_DATE) + "\n" +
        "Valor Bruto: " + this.valorBruto + "\n" +
        "Valor Impostos: " + this.valorImpostos + "\n";
    }
}
