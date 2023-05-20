package com.example.projeto;

import java.util.ArrayList;
import java.util.List;

public class Nota {

    private NotaEstado estado;
    private List<NotaEstado> memento = new ArrayList<NotaEstado>();

    public NotaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(NotaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<NotaEstado> getEstados() {
        return this.memento;
    }
}
