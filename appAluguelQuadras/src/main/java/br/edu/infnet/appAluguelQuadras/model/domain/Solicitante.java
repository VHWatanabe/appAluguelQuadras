package br.edu.infnet.appAluguelQuadras.model.domain;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TSolicitante")
public class Solicitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private String pernaDominante;

    @ManyToMany (mappedBy = "listaJogadores")
    private List<Lobby> lobbies;

    @Override
    public String toString() {
        return String.format("Id: (%d) - Nome: (%s) - CPF: (%s) - Email: (%s) - Perna Dominante: (%s)", id, nome, cpf, email, pernaDominante);
    }

    public Solicitante() {}

    public Solicitante(Integer id) {
        this.id = id;
    }

    public Solicitante(String nome, String cpf, String email, String pernaDominante) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.pernaDominante = pernaDominante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Lobby> getLobbies() {
        return lobbies;
    }

    public void setLobbies(List<Lobby> lobbies) {
        this.lobbies = lobbies;
    }
}
