package com.example.projeto;

public class NotaEstadoRestaurada implements NotaEstado{

    private NotaEstadoRestaurada() {};
    private static NotaEstadoRestaurada instance = new NotaEstadoRestaurada();
    public static NotaEstadoRestaurada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Restaurada";
    }
}
