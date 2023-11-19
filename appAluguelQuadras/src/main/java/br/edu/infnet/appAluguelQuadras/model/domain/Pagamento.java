package br.edu.infnet.appAluguelQuadras.model.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pagamento {

    private Solicitante solicitante;
    private String numCartao;
    private LocalDate vencimento;
    private int cvv;
    private boolean status;
    private int codigoPagamento;

    DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("MM/yyyy");

    @Override
    public String toString() {
        return String.format("Solicitante: (%s) - Número Cartão: (%s) - ", solicitante, numCartao) + "Vencimento: " + getVencimento().format(dataFormatada) + String.format(" - CVV: (%d) - Status: (%b) - Código Pagamento: (%d)", cvv, status, codigoPagamento);
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCodigoPagamento() {
        return codigoPagamento;
    }

    public void setCodigoPagamento(int codigoPagamento) {
        this.codigoPagamento = codigoPagamento;
    }
}
