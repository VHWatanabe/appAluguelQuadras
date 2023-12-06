package br.edu.infnet.appAluguelQuadras.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "TAvaliacao")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private float nota;
    private int codigoAvaliacao;

    @OneToOne (cascade = CascadeType.DETACH)
    @JoinColumn(name = "idSolicitante")
    private Solicitante solicitante;

    @Override
    public String toString() {
        return String.format("Nota: (%.1f) - Solicitante: (%s) - Código da Avaliação: (%d)", nota, solicitante, codigoAvaliacao);
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public int getCodigoAvaliacao() {
        return codigoAvaliacao;
    }

    public void setCodigoAvaliacao(int codigoAvaliacao) {
        this.codigoAvaliacao = codigoAvaliacao;
    }
}
