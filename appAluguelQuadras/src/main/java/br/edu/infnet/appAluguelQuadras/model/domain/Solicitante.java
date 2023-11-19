package br.edu.infnet.appAluguelQuadras.model.domain;

public class Solicitante {
    private String nome;
    private String cpf;
    private String email;
    private String pernaDominante;

    @Override
    public String toString() {
        return String.format("Nome: (%s) - CPF: (%s) - Email: (%s) - Perna Dominante: (%s)", nome, cpf, email, pernaDominante);
    }

    public Solicitante() {

    }

    public Solicitante(String nome, String cpf, String email, String pernaDominante) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.pernaDominante = pernaDominante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPernaDominante() {
        return pernaDominante;
    }

    public void setPernaDominante(String pernaDominante) {
        this.pernaDominante = pernaDominante;
    }
}
