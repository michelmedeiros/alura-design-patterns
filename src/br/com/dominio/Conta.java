package br.com.dominio;

/**
 * Created by michel on 09/01/17.
 */
public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
