package br.edu.infnet.appAluguelQuadras.model.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Agenda {
    private LocalTime horario;
    private LocalDate data;
    private String nomeQuadra;
    private float valor;

    DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");
    DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("d-MMM-yyyy");

    @Override
    public String toString() {
        return " Horário: " + getHorario().format(horaFormatada) + " - " + "Data: " + getData().format(dataFormatada) + " - " + String.format("Quadra: (%s) - Valor: (%.2f)", nomeQuadra, valor);
    }

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
