package ControlStockLibreria;

public interface ControlStock {
    void addToStock(long cantidadLong) throws ExcepcionStockDesbordado;
    void removeFromStock(long cantidadLong) throws ExcepcionStockDesbordado;
    int getStock();
}
