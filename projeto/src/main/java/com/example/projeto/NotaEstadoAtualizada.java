package com.example.projeto;

public class NotaEstadoAtualizada implements NotaEstado{

    private NotaEstadoAtualizada() {};
    private static NotaEstadoAtualizada instance = new NotaEstadoAtualizada();
    public static NotaEstadoAtualizada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Atualizada";
    }
}
