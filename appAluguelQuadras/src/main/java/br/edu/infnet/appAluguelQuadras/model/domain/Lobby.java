package br.edu.infnet.appAluguelQuadras.model.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TLobby")
public class Lobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipoEsporte;
    private int  qtdJogadores;
    private int codigoLobby;

    @ManyToMany (cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn (name = "idLobby")
    private List<Solicitante> listaJogadores;

    @Override
    public String toString() {
        return String.format("Esporte: (%s) - Quantidade de Jogadores: (%d) - Código da Lobby: (%d) - Jogadores: (%s)", tipoEsporte, qtdJogadores, codigoLobby, listaJogadores);
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

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
