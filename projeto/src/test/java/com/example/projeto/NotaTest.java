package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class NotaTest {

    @Test
    void deveArmazenarEstados() {
        Nota nota = new Nota();
        nota.setEstado(NotaEstadoSalva.getInstance());
        nota.setEstado(NotaEstadoDeletada.getInstance());
        assertEquals(2, nota.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Nota nota = new Nota();
        nota.setEstado(NotaEstadoSalva.getInstance());
        nota.setEstado(NotaEstadoDeletada.getInstance());
        nota.restauraEstado(0);
        assertEquals(NotaEstadoSalva.getInstance(), nota.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Nota nota = new Nota();
        nota.setEstado(NotaEstadoSalva.getInstance());
        nota.setEstado(NotaEstadoEditada.getInstance());
        nota.setEstado(NotaEstadoSalva.getInstance());
        nota.setEstado(NotaEstadoDeletada.getInstance());
        nota.restauraEstado(2);
        assertEquals(NotaEstadoSalva.getInstance(), nota.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Nota nota = new Nota();
            nota.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
