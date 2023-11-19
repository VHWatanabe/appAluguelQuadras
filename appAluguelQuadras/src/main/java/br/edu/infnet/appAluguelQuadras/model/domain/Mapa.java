package br.edu.infnet.appAluguelQuadras.model.domain;

public class Mapa {
    private int codigoQuadra;
    private double latitude;
    private double longitude;
    private String nome;
    private String descricao;

    @Override
    public String toString() {
        return String.format("Cód. Quadra: (%d) - Latitude: (%.15f) - Longitude: (%.15f) - Nome: (%s) - Descrição: (%s)", codigoQuadra, latitude, longitude, nome, descricao);
    }

    public int getCodigoQuadra() {
        return codigoQuadra;
    }

    public void setCodigoQuadra(int codigoQuadra) {
        this.codigoQuadra = codigoQuadra;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
