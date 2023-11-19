package br.edu.infnet.appAluguelQuadras.model.domain;

public class Avaliacao {
    private float nota;
    private Solicitante solicitante;
    private int codigoAvaliacao;

    @Override
    public String toString() {
        return String.format("Nota: (%.1f) - Solicitante: (%s) - Código da Avaliação: (%d)", nota, solicitante, codigoAvaliacao);
    }

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
