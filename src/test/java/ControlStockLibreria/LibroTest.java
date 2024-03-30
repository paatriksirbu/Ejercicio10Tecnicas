package ControlStockLibreria;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @org.junit.jupiter.api.Test
    void addToStock() {
        Libro libro = new Libro("El Quijote");
        try {
            libro.addToStock(1);
            assertEquals(1, libro.getStock());
            libro.addToStock(1);
            assertEquals(2, libro.getStock());
            libro.addToStock(1);
            assertEquals(3, libro.getStock());
        } catch (ExcepcionStockDesbordado excepcionStockDesbordado) {
            fail("No debería lanzarse la excepción");
        }
    }

    @org.junit.jupiter.api.Test
    void removeFromStock() {
        Libro libro = new Libro("El Quijote");
        try {
            libro.addToStock(3);
            libro.removeFromStock(1);
            assertEquals(2, libro.getStock());
            libro.removeFromStock(1);
            assertEquals(1, libro.getStock());
            libro.removeFromStock(1);
            assertEquals(0, libro.getStock());
        } catch (ExcepcionStockDesbordado excepcionStockDesbordado) {
            fail("No debería lanzarse la excepción");
        }
    }

    @org.junit.jupiter.api.Test
    void removeFromStockException() {
        Libro libro = new Libro("El Quijote");
        try {
            libro.addToStock(3);
            libro.removeFromStock(1);
            libro.removeFromStock(2);
        } catch (ExcepcionStockDesbordado excepcionStockDesbordado) {
            assertEquals("El stock del libro El Quijote excede la capacidad de este sistema.", excepcionStockDesbordado.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void addToStockException() {
        Libro libro = new Libro("El Quijote");
        try {
            libro.addToStock(3);
            libro.addToStock(1);
        } catch (ExcepcionStockDesbordado excepcionStockDesbordado) {
            assertEquals("El stock del libro El Quijote excede la capacidad de este sistema.", excepcionStockDesbordado.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void getStock() {
        Libro libro = new Libro("El Quijote");
        assertEquals(0, libro.getStock());
    }
}