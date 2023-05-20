package com.example.projeto;

public class NotaEstadoDeletada implements NotaEstado{

    private NotaEstadoDeletada() {};
    private static NotaEstadoDeletada instance = new NotaEstadoDeletada();
    public static NotaEstadoDeletada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Deletada";
    }
}
