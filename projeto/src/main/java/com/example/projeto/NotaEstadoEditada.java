package com.example.projeto;

public class NotaEstadoEditada implements NotaEstado{

    private NotaEstadoEditada() {};
    private static NotaEstadoEditada instance = new NotaEstadoEditada();
    public static NotaEstadoEditada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Editada";
    }
}
