package br.com.dominio;

import br.com.state.EstadoConta;
import br.com.state.Positivo;

import java.time.LocalDate;

/**
 * Created by michel on 09/01/17.
 */
public class Conta {

    private double saldo;

    private String titular;

    private Banco banco;

    private String numero;

    private String agencia;

    private LocalDate dataAbertura;

    private EstadoConta estadoConta;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta(double saldo, String titular, Banco banco, String numero, String agencia) {
        this.saldo = saldo;
        this.titular = titular;
        this.banco = banco;
        this.numero = numero;
        this.agencia = agencia;
    }

    public Conta(double saldo, LocalDate dataAbertura) {
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.estadoConta = new Positivo();
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void saque(double valor) {
        this.estadoConta.saca(this, valor);
    }

    public void deposita(double valor) {
        this.estadoConta.deposita(this, valor);
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

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }


    public void setEstadoConta(EstadoConta estadoConta) {
        this.estadoConta = estadoConta;
    }

    @Override
    public String toString() {
        return "Conta - Saldo: " + this.getSaldo();
    }
}
