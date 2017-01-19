package br.com.dominio;

/**
 * Created by michel on 09/01/17.
 */
public class Conta {

    private double saldo;

    private String titular;

    private Banco banco;

    private String numero;

    private String agencia;

    public Conta(double saldo, String titular, Banco banco, String numero, String agencia) {
        this.saldo = saldo;
        this.titular = titular;
        this.banco = banco;
        this.numero = numero;
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
