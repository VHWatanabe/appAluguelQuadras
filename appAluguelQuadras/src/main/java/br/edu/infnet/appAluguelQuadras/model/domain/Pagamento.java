package br.edu.infnet.appAluguelQuadras.model.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "TPagamento")
public class Pagamento {

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idSolicitante")
    private Solicitante solicitante;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numCartao;
    private LocalDate vencimento;
    private int cvv;
    private boolean status;
    private int codigoPagamento;

    @Override
    public String toString() {
        return String.format("Solicitante: (%s) - Número Cartão: (%s) - ", solicitante, numCartao) + "Vencimento: " + getVencimento() + String.format(" - CVV: (%d) - Status: (%b) - Código Pagamento: (%d)", cvv, status, codigoPagamento);
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

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }
}
