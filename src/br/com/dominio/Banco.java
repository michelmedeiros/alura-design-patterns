package br.com.dominio;

import java.time.LocalDateTime;

/**
 * Created by miche on 18/01/2017.
 */
public class Banco {

    private String nome;
    private String telefone;
    private String endereco;
    private String email;

    public Banco(String nome) {
        this.nome = nome;
    }

    public Banco(String nome, String telefone, String endereco, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDataAtual() {
        return LocalDateTime.now();
    }
}
