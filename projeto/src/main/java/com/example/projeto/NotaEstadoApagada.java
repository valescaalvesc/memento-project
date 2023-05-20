package com.example.projeto;

public class NotaEstadoApagada implements NotaEstado{

    private NotaEstadoApagada() {};
    private static NotaEstadoApagada instance = new NotaEstadoApagada();
    public static NotaEstadoApagada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Apagada";
    }
}
