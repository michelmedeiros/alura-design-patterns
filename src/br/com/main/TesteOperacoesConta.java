package br.com.main;

import br.com.dominio.Conta;

import java.time.LocalDate;

/**
 * Created by miche on 21/01/2017.
 */
public class TesteOperacoesConta {

    public static void main(String[] args) {
        Conta conta = new Conta(100, LocalDate.now());
        conta.deposita(10);
        System.out.println("Deposito: " + 10 + " Saldo: " + conta.getSaldo());
        conta.saque(200);
        System.out.println("Saque: " + 200 + " Saldo: " + conta.getSaldo());
        conta.saque(10);
    }
}
