package br.edu.infnet.appAluguelQuadras.model.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "TAgenda")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalTime horario;
    private LocalDate data;
    private String nomeQuadra;
    private float valor;

    @Override
    public String toString() {
        return "ID: " + getId() + "Horário: " + getHorario() + " - " + "Data: " + getData() + " - " + String.format("Quadra: (%s) - Valor: (%.2f)", nomeQuadra, valor);
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeQuadra() {
        return nomeQuadra;
    }

    public void setNomeQuadra(String nomeQuadra) {
        this.nomeQuadra = nomeQuadra;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
