package com.example.projeto;

public class NotaEstadoSalva implements NotaEstado{

    private NotaEstadoSalva() {};
    private static NotaEstadoSalva instance = new NotaEstadoSalva();
    public static NotaEstadoSalva getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Salva";
    }
}
