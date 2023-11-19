package br.edu.infnet.appAluguelQuadras.model.domain;

import java.util.List;

public class Lobby {

    private String tipoEsporte;
    private int  qtdJogadores;
    private int codigoLobby;
    private List<Solicitante> listaJogadores;

    @Override
    public String toString() {
        return String.format("Esporte: (%s) - Quantidade de Jogadores: (%d) - Código da Lobby: (%d) - Jogadores: (%s)", tipoEsporte, qtdJogadores, codigoLobby, listaJogadores);
    }

    public String getTipoEsporte() {
        return tipoEsporte;
    }

    public void setTipoEsporte(String tipoEsporte) {
        this.tipoEsporte = tipoEsporte;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public void setQtdJogadores(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }

    public int getCodigoLobby() {
        return codigoLobby;
    }

    public void setCodigoLobby(int codigoLobby) {
        this.codigoLobby = codigoLobby;
    }

    public List<Solicitante> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(List<Solicitante> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }
}
